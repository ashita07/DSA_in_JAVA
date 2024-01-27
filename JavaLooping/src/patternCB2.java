
/*
 * * * * *
 * *   * *
 *       *
 * *   * *
 * * * * *
*/
import java.util.*;
public class patternCB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int nst = (n+1)/2;
       int nsp =-1 ;
        while(row<=n){
            for(int i=1;i<=nst;i++){
                System.out.print("*");
            }
            for(int i=1;i<=nsp;i+=1){
                System.out.print(" ");
            }


                if(row==1 || row ==n){
                    for(int i=2;i<=nst;i++){
                        System.out.print("*");
                    }
                }else{
                    for(int i=1;i<=nst;i++){
                        System.out.print("*");
                }}

            System.out.println();

            if (row<=(n-1)/2){
                nst--;
                nsp+=2;
            }else{
                nst++;
                nsp-=2;
            }

            row++;
        }
    }
}
