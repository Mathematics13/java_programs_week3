package homework_week_7;

import java.util.Arrays;

/** Program 19
 * Write a Java program to calculate the average value of array
 */
public class Program19_AverageOfArray
{
    public static void main(String[] args)
    {
        int numArray[] = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};          //Numeric array decalaration
        int sum =0;
        for (int i=0; i<numArray.length ; i++)
        {
            sum = sum + numArray[i];                                          //Calculating the sum of arrays value
        }
        int average = sum/numArray.length;                                  //Finding the average of arrays value
        System.out.println("Values of the elements of the array are : "    + Arrays.toString(numArray));
        System.out.println("Average of all the values of the array are : " + average);
    }
}
