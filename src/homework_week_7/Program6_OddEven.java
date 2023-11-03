package homework_week_7;

import java.util.Scanner;

/** program 6
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Program6_OddEven
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                            //Scanner declaration for reading input from console
        System.out.println("Enter the number you want to check : ");
        int number = scanner.nextInt();
        isItEvenOrOddNumber(number);
        System.out.println(number + " is " +   isItEvenOrOddNumber(number) + " number ");
        scanner.close();                                                    //Closing the scanner object
    }

    //Checking odd or Even
    public static String isItEvenOrOddNumber(int number)                   //Method can be static or non-static
    {
        if(number%2==0)
        {
            return "Even";                                               //Since return is String, String return type is used
        }
        else
        {
            return "Odd";
        }
    }
}
