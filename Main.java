// Name : Harsh Patel (100849927)
// Date : 13 NOV 2022


import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String[] myStrings = new String[Console.Instance().NUM_OF_STRINGS]; // new empty container of type String
        Integer[] myInts = new Integer[Console.Instance().NUM_OF_INTEGERS];

        for (int i = 0; i < Console.Instance().NUM_OF_STRINGS; i++)
        {
            myStrings[i] = Console.Instance().getConsoleInputToArray("Please enter your name: ", myStrings);
        }

        Console.Instance().displayArray(myStrings);

        for (int i = 0; i < Console.Instance().NUM_OF_INTEGERS; i++)
        {
            myInts[i] = Console.Instance().getConsoleInputToArray("Please enter your number: ", myInts);
        }

        Console.Instance().displayArray(myInts);


    }
}