package homework_week_7;

import java.util.Scanner;

/** Program 12
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Program12_FindInputValue
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                                   //Scanner declaration for reading input from console
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
        Program12_FindInputValue inputValue = new Program12_FindInputValue ();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        scanner.close();                                                           //Closing the scanner object
    }

    public void checkInputValueIsAlphabetNumberOrSymbol(char ch)
    {
        if((ch>='a' && ch <= 'z' ) || (ch >='A' && ch <= 'Z'))
        {
            System.out.println(ch + " is an ALPHABET ");
        }
        else if((ch>= '0'  &&  ch<= '9'))
        {
            System.out.println(ch + " is a DIGIT ");
        }
        else
        {
            System.out.println(ch + " is a SYMBOL");
        }
    }
}
