public class pattern
{
   public  static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int s =4;s>=i;s--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
