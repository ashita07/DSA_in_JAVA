import java.util.Scanner;
public class CaseCheck
{
    public static void main(String [] Args)
    {
        Scanner a= new Scanner (System.in);
        char ch = a.next().trim().charAt(3);
        System.out.println(ch);
        String d="what the heck";
        System.out.println(d.charAt(7));
        if(ch>='a'&& ch<='z')
        {
            System.out.println(ch);
        }
    }
}
