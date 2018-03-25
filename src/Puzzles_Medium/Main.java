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

    public static void main(String[] args) {
        System.out.println(starKill("ab**cd")); // "ad"
    }
}
