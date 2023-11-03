package homework_week_7;

import java.util.Scanner;

/** Program 10
 * Write a java program to input any two number and ask user to enter their symbol (+, -, * ,/ )
 *  find addition, Subtraction, multiplication and division according to their symbol
 *   (using if else)
 */
public class Program10_DoOperationwithSymbol
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                                  //Scanner declaration for reading input from console
        System.out.println("Enter the first number : ");
        int x = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int y = scanner.nextInt();
        System.out.println("Select the calculation symbol +,-,*,/ : ");
        char symbol = scanner.next().charAt(0);
        doOperationBySelectingSymbol( x, y , symbol);
        scanner.close();                                                          //Closing the scanner object
    }

    public static void doOperationBySelectingSymbol(int x, int y ,char symbol)
    {
        if(symbol == '+')
        {
            System.out.println(x + " + " + y + " = " + (x+y));
        }
        else if(symbol == '-')
        {
            System.out.println(x + " - " + y + " = " + (x-y));
        }
        else if(symbol == '*')
        {
            System.out.println(x + " * " + y + " = " + (x*y));
        }
        else if(symbol == '/')
        {
            System.out.println(x + " / " + y + " = " + (x/y));
        }
        else
        {
            System.out.println("Enter correct symbol +,-,*,/");
        }
    }
}
