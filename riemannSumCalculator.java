import java.util.*;
import java.math.*;

public class riemannSumCalculator
{
    public static Scanner userInputScanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("This is a java calculator for calculating Riemann Sums to estimate volume");

        System.out.print("Please enter n:");
        int nValue = userInputScanner.nextInt();
        System.out.print("Please enter m:");
        int mValue = userInputScanner.nextInt();
        System.out.println("You have entered " + nValue + " as n");
        System.out.println("You have entered " + mValue + " as m\n");

        System.out.print("Please enter your equation:");
        String enteredEquation = userInputScanner.next();
        System.out.println("The equation is:" + enteredEquation);
    }
}