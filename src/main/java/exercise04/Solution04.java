package exercise04;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cristiam Enciso
 *
Exercise 4 - Mad Lib
Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then construct a list of words and place them into the story, creating an often silly or funny story as a result.

Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.

Example Output
Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!
Constraints
Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.
e.g. use printf() instead of println()
Challenges
Add more inputs to the program to expand the story.
Implement a branching story, where the answers to questions determine how the story is constructed.


 */


import java.util.Scanner;

public class Solution04 {
    // create a scanner object
    // prompt user for inputs
    // Store inputs in string variables
    // consolidate inputs into main string variables
    // print out the consolidated strings
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = sc.nextLine();
        System.out.print("Enter a verb: ");
        String verb = sc.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = sc.nextLine();
        System.out.print("enter an adverb: ");
        String adverb = sc.nextLine();

        String string1 = "Do you " + verb + " " + "your " + adjective + " " + noun + " " +adverb + "?";
        String string2 = " That's hilarious!";
        System.out.println(string1 + string2);

    }
}
