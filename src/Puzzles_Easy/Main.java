package Puzzles_Easy;

public class Main {
    /**
     * You are driving a little too fast, and a police officer stops you.
     * Write code to compute the fine you would have to pay.
     * If your speed is 60 or less, the result is 0 since there is no fine.
     * If speed is between 61 and 80 inclusive, the fine is 100 dollars.
     * If speed is 81 or more, the result is 200.
     * Unless it is a holiday -- on that day, your speed can be 5 higher in all cases. <br>
     * <br>
     *
     * <b>EXPECTATIONS:</b><br>
     speedingFine(60, false)  <b>---></b> 0 <br>
     speedingFine (65, false)   <b>---></b> 100 <br>
     speedingFine (65, true) <b>---></b> 0 <br>
     */
    public static int speedingFine(int speed, boolean isHoliday) {
        int minSpeed = 60;
        int maxSpeed = 80;
        int fine = 0;

        if (isHoliday) {
            minSpeed += 5;
            maxSpeed += 5;
        }

        if (speed >= maxSpeed)
            fine = 200;
        if (speed <= minSpeed)
            fine = 0;
        if (speed > minSpeed && speed <= maxSpeed)
            fine = 100;

        return fine;
    }

    /**
     * Given three ints, a b c, return true if it is possible to add two of
     * the ints to get the third. There should only be a single line of code in the method body.<br>
     * <br>
     *
     * <b>EXPECTATIONS:</b><br>
     twoSumOne(1, 2, 3)   <b>---></b> true <br>
     twoSumOne(3, 1, 2)    <b>---></b> true <br>
     twoSumOne(3, 2, 2) <b>---></b> false <br>
     */
    public static boolean twoSumOne(int a, int b, int c) {
        return (a + b == c) || (b + c == a) || (a + c == b);
    }

    /**
     The birds in Florida like to sing during favorable temperatures.
     In particular, they sing if the temperature is between 60 and 90 (inclusive).
     Unless it is summer, then the upper limit is 100 instead of 90.
     Given an int temperature and a boolean isSummer,
     return true if the birds are singing and false otherwise. <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     birdsSinging(70, false)   <b>---></b> true <br>
     birdsSinging(95, false)    <b>---></b> false <br>
     birdsSinging(95, true) <b>---></b> true <br>
     */
    public static boolean birdsSinging(int temp, boolean isSummer) {
        int minTemp = 60;
        int maxTemp = 90;

        if (isSummer) {
            maxTemp = 100;
        }

        if (temp >= minTemp && temp <= maxTemp) {
            return true;
        }

        return false;
    }

    /**
     Given three ints, first, second, third, return true if second is greater than first, and third is
     greater than second. However, with the exception that if the parameter "itsOk" is true,
     second does not need to be greater than first but still better be less than third.
     <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     isOrdered(1, 2, 4, false)   <b>---></b> true <br>
     isOrdered(1, 2, 1, false)    <b>---></b> false <br>
     isOrdered(1, 1, 2, true) <b>---></b> true <br>
     */
    public static boolean isOrdered(int first, int second, int third, boolean itsOk) {
        if (itsOk) {
            return (second < third);
        }

        return (first < second) && (second < third) && (first < third);
    }

    /**
     We'll say a number is cool if it's a multiple of 11 or if it is one more than a multiple of 11.
     Return true if the given non-negative number is cool. Use the % "modulus" operator
     we spoke about in the prerequisite section. Watch the lesson on modulus if you need to review
     <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     isCool(22)   <b>---></b> true <br>
     isCool(23)    <b>---></b> true <br>
     isCool(24) <b>---></b> false <br>
     */
    public static boolean isCool(int n) {
        return (n % 11 == 0) || (n % 11 == 1);
    }

    /**
     Given an int n, return the string form of the number followed by "!".
     So if the int is for example 13 this method should return "13!".
     However the catch is that if the number is divisible by 3 the method should return "Fizz!"
     instead of the number, and if the number is divisible by 5 it should return "Buzz!",
     and if divisible by both 3 and 5, use "FizzBuzz!". You’ll need to use the % "mod"
     for computing the remainder after division, so 23 % 10 yields 3.

     <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     fizzyWizzy(1)   <b>---></b> "1!" <br>
     fizzyWizzy(2)    <b>---></b> "2!" <br>
     fizzyWizzy(3) <b>---></b> "Fizz!" <br>
     */
    public static String fizzyWizzy(int n) {
        boolean fizz = n % 3 == 0;
        boolean buzz = n % 5 == 0;

        if (fizz && buzz) {
            return "fizBuzz!";
        }

        if (fizz) {
            return "Fizz!";
        }

        if (buzz) {
            return "Buzz!";
        }

        return n + "!";


    }

    /**

     Given 3 int arguments - a, b, c, return their sum. However, if one of the arguments
     is the same as any of the other ones, that number should not count towards the sum.
     So basically you only sum unique numbers, not duplicates
     <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     sumUnique(1, 2, 3)   <b>---></b> 6 <br>
     sumUnique(3, 2, 3)    <b>---></b> 2 <br>
     sumUnique(3, 3, 3) <b>---></b> 0 <br>
     */
    public static int sumUnique(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        }

        if (a == b) {
            return c;
        }

        if (a == c) {
            return b;
        }

        if (b == c) {
            return a;
        }

        return a + b + c;

    }

    /**

     Given 2 positive int arguments (a, b), return whichever argument is
     nearest to the number 21 without going over.
     Return 0 if they both go over 21.
     <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     nearestTwentyOne(19, 21)   <b>---></b> 21 <br>
     nearestTwentyOne(21, 19)    <b>---></b> 21 <br>
     nearestTwentyOne(19, 22) <b>---></b> 19 <br>
     nearestTwentyOne(32, 22) <b>---></b> 0 <br>
     */
    public static int nearestTwentyOne(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        }

        if (a > 21 && b <= 21) {
            return b;
        }

        if (b > 21 && a <= 21) {
            return a;
        }

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**

     Given 3 int arguments, a b c, return their sum. However, if one of the arguments is 13
     then it does not count towards the sum and arguments to it's right do not count either.
     So for example, if b is 13, then both b and c do not count.
     <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     partialSum(1, 2, 3)   <b>---></b> 6 <br>
     partialSum(1, 2, 13)    <b>---></b> 3 <br>
     partialSum(1, 13, 3) <b>---></b> 1 <br>
     */
    public static int partialSum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }

        if (b == 13) {
            return a;
        }

        if (c == 13) {
            return a + b;
        }

        return a + b + c;

    }

    /**
     Given a string, return a string where for every char in the original, append another.
     <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     repeatChar("The")  <b>---></b>"TThhee"<br>
     repeatChar("AAbb")    <b>---></b> "AAAAbbbb" <br>
     repeatChar("Hi-There") <b>---></b> "HHii--TThheerree" <br>
     */
    public static String repeatChar(String str) {
        String repeatedChar = "";

        for (int i = 0; i < str.length(); i++) {
            char aChar = str.charAt(i);

            repeatedChar = repeatedChar + aChar + aChar;
        }

        return repeatedChar;
    }

    /**
     *
     Given an array of strings, return the count of the number of strings with the given length
     * <b>EXPECTATIONS:</b><br>
     wordsCount({"a", "bb", "b", "ccc"}, 1) <b>---></b> 2<br>
     wordsCount({"a", "bb", "b", "ccc"}, 3) <b>---></b> 1 <br>
     wordsCount({"a", "bb", "b", "ccc"}, 4) <b>---></b> 0 <br>
     */
    public static int wordsCount(String[] words, int len) {
        int totalCount = 0;

        for (String word : words) {
            if (word.length() == len) {
                totalCount++;
            }
        }

        return totalCount;
    }


    public static void main(String[] args) {
//        System.out.println(speedingFine(65, false)); // 100

//        System.out.println(twoSumOne(1, 2, 3)); // true

//        System.out.println(birdsSinging(95, true)); // true

//        System.out.println(isOrdered(1, 1, 2, true)); // true

//        System.out.println(isCool(23)); // true

//        System.out.println(fizzyWizzy(3)); // "Fizz!"

//        System.out.println(sumUnique(1, 2, 3)); // 6

//        System.out.println(nearestTwentyOne(19, 22)); // 19

//        System.out.println(partialSum(1, 13, 3)); // 1

//        System.out.println(repeatChar("Hi-There")); // "HHii--TThheerree"

        System.out.println(wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1)); // 2
    }
}
