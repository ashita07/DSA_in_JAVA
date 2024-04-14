import java.util.Scanner;

public class palindromeNo
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int c=n;int d;int rev=0;
        while(c!=0)
        { d=c%10;
            rev=rev*10+d;
            c=c/10;
        }
        if(rev==n)
        System.out.println(rev +" is a palindrome number");
        else
            System.out.println(rev +" is not a pallindrome" );
    }
}
