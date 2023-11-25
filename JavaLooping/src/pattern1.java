public class pattern1 {
    public static void main(String[] args) {
        char c='c';
        for(int i=1;i<4;i++)
        {
            for(char j='a';j<=c;j++)
            {
                System.out.print(j);
            }c--;
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
