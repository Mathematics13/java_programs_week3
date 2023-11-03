package homework_week_7;

import java.util.Scanner;

/**Program 1
 *  Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Program1_OddEvenTernaryOperator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                            //Scanner declaration for reading input from console
        System.out.println("Enter the number  : ");
        int number = scanner.nextInt();
        isItOddOrEvenNumber( number);
        scanner.close();                                                  //closing the scanner object
    }
    public static void isItOddOrEvenNumber(int number)                 //Checking the number is even or odd
    {
        String evenOrOdd = (number%2==0) ? "Even" : "Odd";            //ternary operator is used
        System.out.println("The"  + number + "is" + evenOrOdd + "number");
    }
}
