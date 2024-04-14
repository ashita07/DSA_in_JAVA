import java.util.Scanner;
public class A1q4
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
{
    public static void main(String[] args) {

 Scanner input = new Scanner (System.in);
        int sum=0;
 char sign = input.next().charAt(0);
 int n1= input.nextInt();
 int n2= input.nextInt();

 if (sign == '+')
  sum= n1+n2   ;
else if(sign== '-')
     sum= n1-n2;
else if(sign =='*')
     sum = n1*n2;
 else if (sign=='/')
   sum= n1/n2;
        System.out.println("the output is " + sum);
    }
}
