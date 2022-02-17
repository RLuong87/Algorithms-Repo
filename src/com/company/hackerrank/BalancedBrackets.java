package com.company.hackerrank;

import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     *
             * STDIN           Function
        -----           --------
        3               n = 3
        {[()]}          first s = '{[()]}'
        {[(])}          second s = '{[(])}'
        {{[[(())]]}}    third s ='{{[[(())]]}}'
        *
        *
        *
        all the parentheses are matched, i.e., every opening parenthesis has a corresponding closing parenthesis.
        the matched parentheses are in the correct order, i.e., an opening parenthesis should come before the closing parenthesis.

        Create an empty stack.
        Push opening brackets on top of stack.
        In case of a closing bracket, check if the stack is empty.
        If not, pop in a closing bracket if the top of the stack contains the corresponding opening bracket.
        If the opening bracket corresponds with a closing bracket then keep checking the stack is empty
        *
        *
        *  {{}}()[()]
     */

    public static String isBalanced(String s) {

        Stack<Character> balanced = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                balanced.push(c); // Push all the opening brackets into the stack
            } else {
                if (balanced.empty()) { // Check if the stack is empty, if there were opening brackets detected
                    return "NO"; // return no
                } else {
                    if (balanced.peek() == '(' && c == ')' || balanced.peek() == '[' && c == ']' || balanced.peek() == '{' && c == '}') {
                        balanced.pop();
                        System.out.println(balanced);
                    } else {
                        return "NO";
                    }
                }
            }
        }
        if (balanced.empty()) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {

        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{(([])[])[]]}"));
        System.out.println(isBalanced("{{[[(())]]}}"));

        String str = "{(([])[])[]]}";

        Stack<String> balanced = new Stack<>();
        HashMap<String, String> map = new HashMap<>() {{
            put("{", "}");
            put("[", "]");
            put("(", ")");
        }};

        for (String s : str.split("")) {

            if (s.equals("{") || s.equals("[") || s.equals("(")) {
                balanced.push(s);

            } else {
                if (balanced.empty()) {
                    System.out.println("NO");
                }
                if (!balanced.peek().equals("{") && s.equals("}")) {

                }
            }
        }
//        if (balanced.empty()) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }

    }
}

