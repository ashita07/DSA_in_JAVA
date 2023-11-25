import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); int sum=0;
    // Take input from the user till the user does not enter X ot x
        while(true)
{
    System.out.println("Input the operator ");
    char op =input.next().trim().charAt(0);
    if(op=='+' || op=='-'|| op =='*' || op == '/')
    {
        System.out.println("Enter two numbers");
int num1=input.nextInt();
int num2=input.nextInt();
if(op=='+')
    sum=num1+num2;
if(op=='-')
    sum=num1-num2;
 if(op=='*')
    sum=num1*num2;
 if(op=='/')
{if (op!=0)
    sum=num1/num2;
}}
 else if(op== 'x'|| op=='X'){
    break;
}
else
    System.out.println("Invalid operation");


    System.out.println(sum);
}

    }
}
