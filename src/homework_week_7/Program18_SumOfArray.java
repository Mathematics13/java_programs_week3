package homework_week_7;

import java.util.Arrays;

/** Program 18
 * Write a Java program to sum values of an array.
 */
public class Program18_SumOfArray
{
    public static void main(String[] args)
    {
       int numArray[] = {   1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};         //Numeric array declaration
       int sum =0;
       for(int i=0 ; i< numArray.length ; i++)                               //Calculating the Sum of arrays value using for loop
       {
           sum =sum + numArray[i];
       }
        System.out.println("Values of the elements of the array are : " + Arrays.toString(numArray));
        System.out.println("Sum of all the values of the array are : " + sum );
    }
}
