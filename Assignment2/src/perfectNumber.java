import java.util.Scanner;

public class perfectNumber
{/*What is perfect number with example?
perfect number, a positive integer that is equal to the sum of its proper
divisors. The smallest perfect number is 6, which is the sum of 1, 2, and 3.
 Other perfect numbers are 28, 496, and 8,128.05-Jan-2023
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int d=0,c=n,i;
for(i=1;i<n;i++)
{
    if(n%i==0)
        d+=i;
}
if(c==d)
    System.out.println(d);
else
    System.out.println("not a perfect number");
    }

}
