

import java.util.Scanner;

/* Singleton Design Pattern */
public class console
{
    /***************************** SINGLETON SECTION **************************/
    // Step 1. make our constructor private
    private Console()
    {
        NUM_OF_STRINGS = 3;
        NUM_OF_INTEGERS = 5;
        console = new Scanner(System.in);
    }

    // Step 2. make private static instance class member
    private static Console m_instance;

    // Step 3. make a public static creational method usually named Instance or GetInstance
    public static Console Instance()
    {
        if(m_instance == null)
        {
            m_instance = new Console();
        }
        return m_instance;
    }
    /***************************** SINGLETON SECTION **************************/

    // Instance Members
    public final int NUM_OF_STRINGS;
    public final int NUM_OF_INTEGERS;

    private Scanner console;

    /**
     * This is a generic Console Input Function that gets input from the keyboard
     * and saves the data to an element of an array.
     *
     * @param prompt {String}
     * @param object {T[]}
     * @return
     * @param <T>
     */
    public <T> T getConsoleInputToArray(String prompt, T[] object)
    {
        System.out.print(prompt);

        switch (object.getClass().getSimpleName())
        {
            case "Double[]":
                return (T) ((Double)console.nextDouble());
            case "Integer[]":
                return (T) ((Integer)console.nextInt());
            case "Float[]":
                return (T) ((Float)console.nextFloat());
            default:
                return (T) console.nextLine();
        }
    }

    /**
     * This Method displays all the elements of an Array
     * @param array
     * @param <T>
     */
    public <T> void displayArray(T[] array)
    {
        for (var element: array)
        {
            System.out.println(element);
        }
    }
}
