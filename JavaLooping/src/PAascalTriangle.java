import java.util.Scanner;

public class PAascalTriangle {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(); int x=n;
      for(int i=1;i<=n;i++)
      {
          for(int j=x-1;j>=1;j++)
      {
          System.out.print(" ");
      } x--;
          int k; int g=0;int h=1;
          for( k=0;k<=h;k++)
          { int c=factorial(k)/(factorial(g)*factorial(k-g));
              if(g%2==0)
                  System.out.println(c);
              else System.out.println(" ");
          }
          h+=2;
            }
    }
    static int factorial(int k)
    {int f=1;
        for(int a=k;a>=1;a--)
        {
            f*=a;
        }
        return f;
    }
}
