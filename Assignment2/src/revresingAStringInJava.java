import java.util.Scanner;

public class revresingAStringInJava
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a= sc.nextLine();
    String rev ="";char ch;
      //  System.out.println( b =a.length());
    for (int i = a.length()-1;i>=0;i--)
    { ch= a.charAt(i);
        rev+=ch;
    }
        System.out.println(rev);
}
}
