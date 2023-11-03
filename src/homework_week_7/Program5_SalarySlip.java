package homework_week_7;

import java.util.Scanner;

/** Program 5
 *WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 *  * salary
 *  * HRA = basic salary 10%
 *  * DA = Basic salary 8%
 *  * TA = Basic salary 9%
 *  * PF= Basic salary 20%
 *  * Gross salary = basic salary + HRA + TA + DA –PF
 *  * Print in following format
 *  * _______________________________
 *  * | Salary Slip |
 *  * |______________________________|
 *  * | Employee Id : 2564 |
 *  * | Employee Name : Jay |
 *  * |______________________________|
 *  * | Basic Salary : 25000.0 |
 *  * | HRA 10% : 2500.0 |
 *  * | DA 8% : 2250.0 |
 *  * | TA 9% : 2000.0 |
 *  * | PF - 20%; : 5000.0 |
 *  * |______________________________|
 *  * | Gross Salary : 26750.0 |
 *  * |===========================|
 */

public class Program5_SalarySlip
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                               //Scanner declaration for reading input from the console
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        System.out.println("Enter your EmployeeID : ");
        int employeeId = scanner.nextInt();

        System.out.println("Enter Basic Salary : ");
        double basicSalary = scanner.nextDouble();

        double hRA = calculateHRA( basicSalary);                             //Calculating HRA,DA,TA and PF
        double da = calculateDA( basicSalary);
        double ta = calculateTA( basicSalary);
        double pf =calculatePF( basicSalary);

        double grossSalary = basicSalary+hRA+da+ta-pf;                     //Calculating the gross salary

        System.out.println("-------------------------------------------");
        System.out.println("| Salary Slip                            | ");
        System.out.println("|----------------------------------------| ");
        System.out.println("|Employee ID: " + employeeId + "         | ");
        System.out.println("|Employee Name: " + name + "             | ");
        System.out.println("-------------------------------------------");
        System.out.println("|Basic salary : " + basicSalary + "       |");
        System.out.println("|HRA 10%      : " + hRA + "               |");
        System.out.println("|TA 8%        : " + ta + "                |");
        System.out.println("|DA 9%        : " + da+ "                 |");
        System.out.println("|PF- 20%      : " + pf + "                |");
        System.out.println("|--------------------------------------   |");
        System.out.println("|Gross Salary : " + grossSalary + "       |");
        System.out.println("|-----------------------------------------|");
        scanner.close();                                                      //Closing the scanner object
            }

    public static double calculateHRA(double basicSalary)                   //Calculating HRA
    {
        return(basicSalary*10)/100;
    }
    public static double calculateDA(double basicSalary)
    {
        return(basicSalary*8)/100;
    }
    public static double calculateTA(double basicSalary)                    //Calculating TA
    {
        return (basicSalary*9)/100;
    }
    public static double calculatePF(double basicSalary)                    //Calculating PF
    {
        return (basicSalary*20) / 100;
    }
  }
