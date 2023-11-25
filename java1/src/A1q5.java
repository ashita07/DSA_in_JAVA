import java.sql.SQLOutput;
import java.util.Scanner;
public class A1q5
//Take 2 numbers as input and print the largest number.
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n1 = input.nextFloat();
        float n2 = input.nextFloat();
        if (n1 >= n2) {
            System.out.println(n1);
        } else System.out.println(n2);
    }
}