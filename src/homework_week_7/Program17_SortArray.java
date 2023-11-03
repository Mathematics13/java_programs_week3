package homework_week_7;

import java.util.Arrays;

/** Program 17
 * Write a Java program to sort a numeric array and a string array
 */

public class Program17_SortArray
{
    public static void main(String[] args)
    {
        int numArray[]    = { 1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787 };                     //Numeric Array declaration
        String strArray[] = {"Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo"};    //String Array declaration
        System.out.println("Actual Numerical Array was: " + Arrays.toString(numArray));
        Arrays.sort(numArray);                                                                        //Sorting the array
        System.out.println("Sorted Numerical Array is   " + Arrays.toString(numArray) );
        System.out.println("  ");
        System.out.println("Actual String Array was   : " + Arrays.toString(strArray));
        Arrays.sort(strArray);                                                                     //Sorting the array
        System.out.println("Sorted String Array is      " + Arrays.toString(strArray));
    }
}
