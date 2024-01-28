import java.util.*;
public class CBPatterns7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int row=1;
        int nst =1;
        int nsp = n-1;

        while(row<=n){
            for(int i=1;i<=nst;i++){
                System.out.print(i+"      ");
            }
            for(int i=1;i<=nsp;i++){
                System.out.print(" "+"      ");
            }
            for(int i=nsp-1;i>=1;i--){
                System.out.print(" "+"      ");
            }

                if(row==n){
                    for(int i=row-1;i>=1;i--){
                        System.out.print(i+"      ");}
                }else{
                    for(int i=row;i>=1;i--){
                        System.out.print(i+"      ");}
                    }


            System.out.println();
            row++;
            nst++;
            nsp--;
        }
    }
}
