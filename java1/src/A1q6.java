import java.util.Scanner ;
public class A1q6
{//Input currency in rupees and output in USD.
    public static void main (String[] Args)
    {
        Scanner input =new Scanner(System.in);
 float amt = input.nextFloat ();
 amt = amt /80.0f ;
        System.out.println("amount in USD is" + amt);
    }
}
