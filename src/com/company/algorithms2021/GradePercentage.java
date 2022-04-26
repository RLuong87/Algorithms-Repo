package com.company.algorithms2021;

public class GradePercentage {

    /*
    https://edabit.com/challenge/BxnxYJGQ9MMQn2EfR

    This code is a direct translation from the Python version of this challenge to a Java version.
    However, because of the differences between the languages and how they function, the Java code is much harder to understand

    For example, the short, easy to read statement in Python int(userScore[:-1])
    becomes Integer.parseInt(userScore.substring(0,userScore.length()) in Java.

    END TRANSLATOR'S NOTE

    The challenge is to fix all the bugs in this incredibly messy code, which the code in the image might've actually looked like
    (probably not)! The code given will output the same middle two lines as in the image shown above.

    First parameter is the user's score.
    Second parameter is the required score.
    Examples
    grade_percentage("85%", "85%") ➞ "You PASSED the Exam"

    grade_percentage("99%", "85%") ➞ "You PASSED the Exam"

    grade_percentage("65%", "90%") ➞ "You FAILED the Exam"

    Notes:
    Note that inputs will be given as a string percentage number.
    Maintain all capitalization.
    Feel free to declutter and refactor code if it helps!
     */

    public static String gradePercentage(String userScore, String passScore) {
        String s = "";
        userScore = userScore.replaceAll("\\D+", "");
        passScore = passScore.replaceAll("\\D+", "");

        if (Integer.parseInt(userScore) >= Integer.parseInt(passScore)) {
            s += "PASSED";
        }else if (Integer.parseInt(userScore) <= Integer.parseInt(passScore)) {
            s += "FAILED";
        }
        return "You " + s + " the Exam";
    }

    public static void main(String[] args) {

        System.out.println(gradePercentage("85%", "85%"));
        System.out.println(gradePercentage("99%", "85%"));
        System.out.println(gradePercentage("65%", "85%"));

        String score = "85%", pscore = "85%";
        score = score.replaceAll("\\D+", "");
        pscore = pscore.replaceAll("\\D+", "");
        int num1 = Integer.parseInt(score), num2 = Integer.parseInt(pscore);

    }
}
