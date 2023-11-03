package homework_week_7;

import java.util.Scanner;

/** Program 16
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 *  * “ZERO”
 */

public class Program16_FindPositiveNegative
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                               //Scanner declaration for reading input from console
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        findNumberIsPositiveNegativeOrZero( number);
        scanner.close();                                                     //Closing the scanner object
    }

    public static void findNumberIsPositiveNegativeOrZero(int number)      //Finding the number is Positive Or Negative or Zero
    {
        if(number>0)
        {
            System.out.println(number + " is a POSITIVE number ");
        }
        else if(number<0)
        {
            System.out.println(number + " is a NEGATIVE number ");
        }
       else
        {
            System.out.println(number + " is ZERO ");
        }
    }
}
