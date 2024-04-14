 import java.net.SocketOption;
 import  java.util.Scanner;
 public class TypeConversion
{
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        String num1= input.next();
        System.out.println(num1);
        int num = (int)45.44f;
        System.out.println(num);//explicit type casting
        //automatic type promotion in expressions
        int a = 467;
        byte b = (byte)(a); // as the range is more than 256 thus it cannot be typecasted so the answer will be no.%256

        System.out.println(b);
    }
}
