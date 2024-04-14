import java.util.Scanner;
public class A1q7
{//fibonacci numbers 0 1 1 2 3 5 8 13.....
    public static void main (String [] args )
    {
    Scanner input = new Scanner (System.in);
    int n= input.nextInt();
    int c=0 ;

     int   n1= 0 , n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
     while (n2<= n)
     {c=n1+n2;
         System.out.println(c);

         n1=n2;
         n2=c;
     }
    }

}
