import java.util.Scanner;
public class A1q3
{//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int T= input.nextInt();
        float R= input.nextFloat();
        float P = input.nextFloat();
        float  SI = (T*R*P )/100.0f;
        System.out.println( "the simple interest is " +SI);

    }
}
