package homework_week_7;

import java.util.Scanner;

/**Program 8
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 *  any other alphabet should be invalid entry
 */

public class Program8_PrintCityName
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);                       //Scanner declaration for reading input from console
        System.out.println("Enter alphabet between A to F : ");
        char city = scanner.next().charAt(0);
        Program8_PrintCityName cityName= new Program8_PrintCityName();   //Object creation
        cityName.printCityName(city);
        scanner.close();                                                //Closing the scanner object
    }
    public void printCityName(char city)                                //Printing city name
    {
        if(city=='A' || city == 'a')
        {
            System.out.println("Aberdeen");
        }
        else if(city=='B' || city == 'b')
        {
            System.out.println("Belfast");
        }
        else if(city=='C' || city == 'c')
        {
            System.out.println("Cambridge");
        }
        else if(city=='D' || city == 'd')
        {
            System.out.println("Derby");
        }
       else  if(city=='E' || city == 'e')
        {
            System.out.println("Edinburgh");
        }
        else if(city=='F' || city == 'f')
        {
            System.out.println("Feltham");
        }
        else
        {
            System.out.println("The alphabet you entered is not between A to F");
        }
    }
}
