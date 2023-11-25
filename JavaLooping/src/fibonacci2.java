import java.util.Scanner;
public class fibonacci2
{//to find the nth fibonacci number
    public static void main(String []args) {
        Scanner in = new Scanner (System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int c=2;
        int sum;
        while(c<=n){
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
            sum=0;
            c++;
        }
    }
}


