/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */
package exercise04;

import java.util.Scanner;

public class solution04 {
    /*
        Print ("Enter a noun:")

        'noun' = noun input from user

        Print ("Enter a verb:")

        'verb' = verb input from user

        Print ("Enter an adjective:")

        'adj' = adjective input from user

        Print ("Enter an adverb:")

        'adverb' = adverb input from user

        Print ("Do you %s your %s %s %s? That's hilarious!", verb,adj,noun,adverb)

     */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a noun:");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb:");
        String verb = scanner.nextLine();

        System.out.print("Enter an adjective:");
        String adj = scanner.nextLine();

        System.out.print("Enter an adverb:");
        String adverb = scanner.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb,adj,noun,adverb);

    }

}
