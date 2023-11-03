package homework_week_7;

public class Program11_DividedByThreeAndFive
{
    public static void main(String[] args)
    {
        System.out.println("Numbers divisible by 3 are : ");
        for (int i =1 ; i <= 100; i++)
        {
        dividedByThree( i);
        }
        System.out.println("Numbers divisible by 5 are : ");
        for (int j =1 ; j <= 100; j++)
        {
            dividedByFive( j);
        }
    }
    public static void dividedByThree( int number )                     //Divided by three method
    {
        if(number % 3 == 0)
        {
            System.out.print(number + " , ");
        }
    }
    public static void dividedByFive( int number )                     //Divided by five method
    {
        if (number % 5 == 0) {
            System.out.print(number + " , ");
        }
    }
}
