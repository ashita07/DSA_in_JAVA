import java.util.Scanner;

public class factorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int f=1; int s=n;
        for(int i = n; i>=1; i--)
        {
            f*=i;
        }
        System.out.println("factorial od the number "+ s +" is "+ f);
    }
}
