/**
 * ask use to input floating point number 
 * 4 variables = Average of value, Smallet value, Largest value, Range (largestValue - smallestValue)
 * A Sentinel identify user input "Q"
 * While sentinel is .hasNextDouble() keep rolling if statement
 */

import java.util.Scanner;
public class DataSet 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //Variables
        double totalValue = in.nextDouble();
        double smallestValue = totalValue;
        double largestValue = smallestValue;
        int currentValue = 1;
        
        // Looping
        while (in.hasNextDouble())
        {
            for (int i = 2; i <= 4; i++)
            {
                double nextValue = in.nextDouble();
                totalValue = totalValue + nextValue;
                currentValue ++;
                if (nextValue < smallestValue && nextValue < largestValue)
                {
                    smallestValue = nextValue;
                }else
                {
                    largestValue = nextValue;
                }
            }
        }
        double rangeValue = largestValue - smallestValue;
        double averageValue = totalValue/currentValue;

        // Output
        System.out.println("Shih-Hung Yang - Lab6B");
        System.out.printf("Data Set %29s\n","Value");
        System.out.printf("The average of the value is: %9.2f\n", averageValue);
        System.out.printf("The smallest value is %16.2f\n", smallestValue);
        System.out.printf("The largest value is %17.2f\n", largestValue);
        System.out.printf("The range is %25.2f\n", rangeValue);
    }
}