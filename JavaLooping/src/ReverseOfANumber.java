import java.util.Scanner;
public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner a= new Scanner (System.in);
         int n1= a.nextInt();
         int b =n1;int r;int rev=0;
         while(b!=0)
         {
             r=b%10;
             rev =rev*10+r;
             b=b/10;
         }
        System.out.println(rev);
    }
}
