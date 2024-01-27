import java.util.*;
public class CB6 {
    public static void main(String arg[])
    {
        Scanner s= new Scanner(System.in);

        int n=s.nextInt();

        int row = 1;
        int a = 0;
        int b = 1;
        int c = 0;

        while(row<=n)
        {
            int i = 1;
            while(i<=row)
            {
                System.out.print(a +"  ");
                c = b + a;
                a = b;
                b = c;

                i++;
            }
            row++;
            System.out.println();
        }

    }
}
