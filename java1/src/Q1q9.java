import java.lang.Math;
import java.util.Scanner;
public class Q1q9
{//To find Armstrong Number between two given number.
    public static void main(String[] args)
    {int i; int a=0;
        Scanner input = new Scanner (System.in);
        int num= input.nextInt();
        int num2 = input.nextInt();
        for(i=num; i<=num2; i++)
        { a=0;int d=i;int e=i;
            while (d > 0)
            {
               ++ a;
                d = d / 10;
            }
            int c;
            double p = 0;
            while(e!=0)
            {
                c = e%10;
                p += Math.pow(c, a);
                e = e/ 10;
            }
          if (p==i)
              System.out.println(i);

        }
    }
}
