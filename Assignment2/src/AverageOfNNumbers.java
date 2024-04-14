import java.util.Scanner;

public class AverageOfNNumbers
{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);double av; double sum = 0;
        int n;int c=0;
        while(true)
        {   n=sc.nextInt();
            if(n==0)
            break;

            sum+=n;
           ++ c;

        }
        av=sum/c;
        System.out.println("average is "+av);
    }
}
