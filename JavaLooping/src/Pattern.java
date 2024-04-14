public class Pattern {
    public static void main(String[] args) {
        int f=1,a=4;
        for (int i=1;i<=5;i++)
        {
            for(int j=a;j>=1;j--)
            {
                System.out.print(" ");
            }
            a--;
            for(int k=1;k<=f;k++)
            {
                if (i==5)
                System.out.print(i);
                else if(i==1)
                    System.out.print(i);
                else if(k==1||k==f)
                    System.out.print(i);
                else
                    System.out.print(" ");
            }System.out.println();
            f+=2;
        }

    }
}
