import java.util.*;
public class patternCB3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int row =1;
        int nsp = n;
        int nst=1;
        while(row<=n){
            int a=row;

            for(int i= 2;i<=nsp;i++){
                System.out.print(" ");
            }
            for(int i=1;i<=nst;i++){
                System.out.print(a);
                a++;
            }
            --a;
            for(int i=2;i<=nst;i++){
                --a;
                System.out.print(a);

            }
            System.out.println();
            nsp--;
            row++;
            nst++;

        }
    }}
