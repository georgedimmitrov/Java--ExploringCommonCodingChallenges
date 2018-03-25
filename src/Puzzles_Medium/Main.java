package Puzzles_Medium;

public class Main {
    /**
     *
     Return a version of the given string, where for every star (*)
     in the string the star and the chars immediately to its left and right are gone.
     So "ab*cd" yields "ad" and "ab**cd" also yields "ad".   <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     starKill("cd*zq")  <b>---></b>"cq"<br>
     starKill("ab**cd")    <b>---></b> "ad" <br>
     starKill("wacy*xko") <b>---></b> "wacko" <br>
     */
    public static String starKill(String str) {
        int len = str.length();
        String result = "";

        for (int i = 0; i < len; i++) {
            if (i == 0 && str.charAt(i) != '*') {
                result += str.charAt(i);
            }

            if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*') {
                result += str.charAt(i);
            }

            if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*') {
                result = result.substring(0, result.length() - 1);
            }
        }

        return result;
    }

    /**
     *
     Given 2 arrays that are the same length containing strings, compare the 1st string in one array
     to the 1st string in the other array, the 2nd to the 2nd and so on.
     Count the number of times that the 2 strings are non-empty and start with the same char.
     The strings may be any length, including 0.
     <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     matchingChar({"aa", "bb", "cc"}, {"aaa", "xx", "bb"})  <b>---></b> 1<br>
     matchingChar({"aa", "bb", "cc"}, {"aaa", "b", "bb"}) <b>---></b> 2 <br>
     matchingChar({"aa", "bb", "cc"}, {"", "", "ccc"}) <b>---></b> 1 <br>
     */
    public static int matchingChar(String[] a, String[] b) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            String str1 = a[i];
            String str2 = b[i];

            if (!str1.equals("") && !str2.equals("")) {
                if (str1.charAt(0) == str2.charAt(0)) {
                    count++;
                }
            }
        }

        return count;
    }

    /**
     *
     Given a string, return the length of the longest streak of the same chars in the string.

     <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     longestStreak("hayyeu") <b>---></b> 2<br>
     longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
     longestStreak("")  <b>---></b> 0 <br>
     */

    public static int longestStreak(String str) {
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }

            if (count > max) {
                max = count;
            }
        }

        return max;
    }


    public static void main(String[] args) {
//        System.out.println(starKill("ab**cd")); // "ad"

//        System.out.println(matchingChar(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "b", "bb"})); // 2

        System.out.println(longestStreak("XPNzzzddOOOxx")); // 3
    }
}
