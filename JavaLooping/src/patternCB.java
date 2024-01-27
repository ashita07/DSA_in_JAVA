
import java.util.*;
public class patternCB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int row =1;
        int nsp=n-1;
        int nst=n;
        while(row<=n){
            for(int i=1;i<=nsp;i++){
                System.out.print(" ");
            }
            for(int i=1;i<=nst;i++){

                if(row>1 && row<n){
                    if(i==1 || i==nst)
                        System.out.print("*");
                    else System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();

            nsp--;
            row++;
        }
    }
}
