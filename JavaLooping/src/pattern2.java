public class pattern2 {
    public static void main(String[] args) {
        int c=4;
        for(int i=1;i<=3;i++)
        {
            for(int j=3;j>=1;j--)
            {
                System.out.print(c*j);
            }
            c--;
            System.out.println();   }
    }
}
