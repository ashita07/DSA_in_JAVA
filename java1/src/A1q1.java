import java.util.Scanner;
public class A1q1//to check even or odd while taking input from the user

{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        if(num % 2 ==0)
        {
            System.out.println(num + " is even ");
        }
        else
            System.out.println(num+ " is odd");
    }
}
