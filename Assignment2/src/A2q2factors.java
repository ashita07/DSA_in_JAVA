import java.util.Scanner;
public class A2q2factors
{
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       int num = in.nextInt();int i;
       for(i=1;i<=num;i++)
       {
           if(num%i==0)
           {
               System.out.println(i + " is a factor of " + num);
           }
       }
    }
}
