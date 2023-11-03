package homework_week_7;

/** Program 20
 * Write a Java program to test if an array contains a specific
 *  value.
 */
public class Program20_FindValueInArray
{
    public static void main(String[] args)
    {
        int numArray[] = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};          //Declaring the numeric array
        System.out.println(isArrayContains( numArray,2035 ));
        System.out.println(isArrayContains( numArray,7999 ));
    }
    public static boolean isArrayContains( int[] arr, int item )                  //This method will find the if array contains value or not
    {
        boolean isContain = false;
        for(int i=0; i < arr.length ; i++)
        {
            if(arr[i] == item)
            {
                isContain = true;
                break;
            }
        }
        return isContain;
    }
}
