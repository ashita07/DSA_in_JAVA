import java.util.Scanner;

public class A1q1
{
    public static void main(String[] args)
    {
        Scanner n= new Scanner (System.in);
         double area=0;
int a=0;
        String s= n.next();
        if(a==s.compareTo("circle"))
        {
            double r= n.nextDouble();
            area=3.14*r*r;
            System.out.println( area );
        }
       else  if(a== s.compareTo("triangle"))
        {double sh=n.nextDouble();
            double st=n.nextDouble();
            area=0.5*sh*st;
            System.out.println( area  );
        }
       else if(a==s.compareTo("rectangle"))
        {
            double sr=n.nextDouble();
            area=sr*sr;
            System.out.println( area  );
        }
       else if(a==s.compareTo("parallelogram"))
        {
            double p= n.nextDouble();
            double h=n.nextDouble();
            area=0.5*(p+p)*h;
            System.out.println( area  );
        }
        else
        { System.out.println("invalid input");}

    }
}
