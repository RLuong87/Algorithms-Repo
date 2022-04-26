
public class Main {

    public static void main(String[] args) {

        System.out.println(titleCase("luke i am your father"));
        System.out.println(reverseStr("I'm the king of the world"));
        System.out.println(findLongestWord("I know what you did last summer"));
        System.out.println(repeatAString("Hello", 7));
        System.out.println(convertCelsiusToF(30));
        System.out.println(convertFahrenheitToC(65));
        System.out.println(factorialize(7));
        System.out.println(truncateAStr("A-tisket A-tasket a green and yellow basket", 8));
        System.out.println(confirmTheEnding("I'm off the deep end, watch as I dive in", "end"));
    }

    //modifier access, is static. Return type. method name. (param-data-type param-name)
    public static String titleCase(String input) {

        //split string into array of strings
        //iterate through the array and title case one word at a time
        //join array back into one string

        //let splitInput = input.split(" ")
        String[] splitInput = input.split(" ");

        for (int i = 0; i < splitInput.length; i++) {

            splitInput[i] = splitInput[i].substring(0, 1).toUpperCase() + splitInput[i].substring(1);
        }
        String result = "";

        for (int i = 0; i < splitInput.length; i++) {

            result += splitInput[i] + " ";
        }
        return result.trim();

    }

    public static String reverseStr(String str) {

        // Created a new character array as a place holder for the string
        char[] chars = new char[str.length()]; // str.length() will indicate a sequence of a string or strings

        // count variable
        int num = 0;

        // iterating through the length of the string with a reverse for loop
        for (int i = str.length() - 1; i >= 0; i--) {
            /*
             use num in bracket notations to count the characters and using charAt(i) to loop through each character
             and return characters in reverse
             */
            chars[num] = str.charAt(i); // gaining access to each character
            num++; // increment each time until the end of the loop

        }
        //empty string to store the result
        String emptyStr = "";

        // iterate through the reversed string
        for (int i = 0; i < str.length(); i++) {

            emptyStr += chars[i];
        }
        return emptyStr;

    }

    public static int convertCelsiusToF(int a) {

        // Convert Celsius to Fahrenheit
        return a * 9 / 5 + 32;
    }

    public static int convertFahrenheitToC(int b) {

        // Convert Fahrenheit to Celsius
        return (b - 32) * 5 / 9;
    }

    public static int factorialize(int c) {

        int factor = 1;

        for (int i = 1; i <= c; i++) {

            factor *= i;
        }

        return factor;
    }

    public static String findLongestWord(String find) {

        // Split the string into an array of strings
        String[] words = find.split(" ");

        // Create an empty string
        String longWord = "";

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > longWord.length()) {

                longWord = words[i];
            }
        }
        return "The longest word in the string is " + longWord + " and the length of the string is " + longWord.length();

    }

    public static String repeatAString(String rep, int num) {

        String strRepeat = "";

        for (int i = 0; i < num; i++) {

            strRepeat += rep;
        }
        return strRepeat;

    }

    public static String truncateAStr(String trunc, int num) {

        if (num < trunc.length()) {
            return trunc.substring(0, num) + "...";
        } else {
            return trunc;
        }
    }

    public static Object confirmTheEnding(String str, String end) {

        if (str.endsWith(end)) {
            return true;
        } else {
            return false;
        }
    }
}
