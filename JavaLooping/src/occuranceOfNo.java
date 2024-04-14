import java.util.Scanner;
public class occuranceOfNo
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int n1= s.nextInt();
        int a=0;
       int  b=n1;int x;
        while(b!=0)
        {
            x=b%10;
            if(x==7)
                a++;
            b=b/10;
          //  x=0;
        }
        System.out.println("no. of seven digit no. is "+ a);
    }
}
