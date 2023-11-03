package homework_week_7;

import java.util.Scanner;

/** Program 9
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 *  * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */
public class Program9_PrintCityNameWithSwitch
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                               //Scanner declaration for reading input from console
        System.out.println("Enter alphabet between A to F : ");
        String city = scanner.next().toUpperCase();
        Program9_PrintCityNameWithSwitch  cityName = new Program9_PrintCityNameWithSwitch();
        cityName.printCityName(city);
        scanner.close();                                                      //Closing the scanner object
    }
public void printCityName(String city)                                       //Printing city name
{
    switch(city)
    {
        case "A":
            System.out.println("Aberdeen");
            break;
        case "B":
            System.out.println("Belfast");
            break;
        case "C":
            System.out.println("Cambridge");
            break;
        case "D":
            System.out.println("Derby");
            break;
        case "E":
            System.out.println("Edinburgh");
            break;
        case "F":
            System.out.println("Feltham");
            break;
        default:
            System.out.println("The alphabet you entered is not between A to F  ");
    }
}
}
