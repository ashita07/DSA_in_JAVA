import java.util.Scanner;

public class sumOfInfiniteSeries {
    public static void main(String[] args)
    {int sum=0,sum1=0;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
          for(int j=1;j<=i;j++)
          {
              sum+=j;
          }
          System.out.print(sum+" ");
          sum=0;
      }

    }
}
