package com.company;

public class RockPaperScissors {

    /*
    Edabit Challenge https://edabit.com/challenge/3S8XppR6Yf5mXPxij

    Create a function which simulates the game "rock, paper, scissors".
    The function takes the input of both players (rock, paper or scissors), first parameter from first player, second from second player.
    The function returns the result as such:

    "Player 1 wins"
    "Player 2 wins"
    "TIE" (if both inputs are the same)
    The rules of rock, paper, scissors, if not known:

    Both players have to say either "rock", "paper" or "scissors" at the same time.
    Rock beats scissors, paper beats rock, scissors beat paper.

    Examples:
    rps("rock", "paper") ➞ "Player 2 wins"

    rps("paper", "rock") ➞ "Player 1 wins"

    rps("paper", "scissors") ➞ "Player 2 wins"

    rps("scissors", "scissors") ➞ "TIE"

    rps("scissors", "paper") ➞ "Player 1 wins"
     */

    public static String rps(String s1, String s2) {

        String rock = "rock", paper = "paper", scissors = "scissors";

        if (s1.equals(rock) && s2.equals(scissors) || s1.equals(paper) && s2.equals(rock) || s1.equals(scissors) && s2.equals(paper)) {
            return "Player 1 wins";
        } else if (s2.equals(rock) && s1.equals(scissors) || s2.equals(paper) && s1.equals(rock) || s2.equals(scissors) && s1.equals(paper)) {
            return "Player 2 wins";
        } else {
            return "TIE";
        }
    }

    public static void main(String[] args) {

        System.out.println(rps("rock", "scissors"));
        System.out.println(rps("paper", "rock"));
        System.out.println(rps("scissors", "paper"));
        System.out.println(rps("scissors", "rock"));
        System.out.println(rps("rock", "paper"));
        System.out.println(rps("paper", "scissors"));
        System.out.println(rps("rock", "rock"));
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("paper", "paper"));
    }
}
