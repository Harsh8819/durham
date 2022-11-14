/*
File_Name            :-  OOP2_LAB-1.java .
Students Name and ID :-  Harsh Patel(100849927)
						 Kanvi Patel(100842924).
Date                 :-  13 NOV 2022.
Course Name	         :-  Object Oriented Programming - 2.
Course Code 		 :-  OOP3200.

*/

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[]args)
    {
        //Name of player
        String[]names = {"Harsh","Kanvi","Tom"};

        int numOfGames = 2;
        int[][] scores = new int[names.length][numOfGames];
        readScore(names,scores);
        System.out.println();
        DisplayReport(names,scores);
    }
    public static void readScore(String[] names, int[][] scores)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                try {
                    System.out.print("Please enter " + names[i] + "'s score for Game#" + (j + 1) + ": ");
                    scores[i][j] = input.nextInt();
                    while (scores[i][j]<0 || scores[i][j]>300)
                    {
                        System.out.println("Invalid input. Value between 0 and 300 needed. Please try again.");
                        System.out.print("Please enter " + names[i] + "'s score for Game#" + (j + 1) + ": ");
                        scores[i][j] = input.nextInt();
                    }
                }
                catch (InputMismatchException ex)
                {
                    System.out.println("Invalid input. Numeric value needed. Please try again...");
                    j=j-1;
                    input.nextLine();
                }

            }

        }
    }

    public static void DisplayReport(String[] names, int[][] scores)
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < names.length; i++) {
            result.append(String.format("Score Details for %s: %nGAME # 1: %5s%nGAME # 2: %5s%nAverage for %s: %s %n%n", names[i], scores[i][0],scores[i][1], names[i], ((double) (scores[i][0] + scores[i][1])) / 2));
        }
        System.out.println(result);
    }
}