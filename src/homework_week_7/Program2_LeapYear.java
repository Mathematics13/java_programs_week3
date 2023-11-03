package homework_week_7;

import java.util.Scanner;

/** Program 2
 * Write a Java Program to input any year like (ex: 2007) and find out if it is leap year or not
 */
public class Program2_LeapYear
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                                    //Scanner declaration for reading input from console
        System.out.println("Enter the year : ");
        int year = scanner.nextInt();
        Program2_LeapYear leapYear= new Program2_LeapYear();
        leapYear.isItLeapYear(year);
        scanner.close();                                                         //Closing the scanner object
    }

    public void isItLeapYear(int year)                                       //Checking is it leap year or not
    {
        if(year%4==0 && year%100!=0 || year%400==0)                        //year must be divisible by 4 not by 100
        {
            System.out.println("The year " +year + " is leap year ");   //Year must be divisible by 400
            return;
        }
        System.out.println("The year" +year + "is not a leap year");
    }









}
