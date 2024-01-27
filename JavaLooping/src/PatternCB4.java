import java.util.*;

public class PatternCB4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int row =1;
           int nsp = (n-1)/2;
           int nst = 1;
           while(row<=n){
               for(int i=1;i<=nsp;i++){
                   System.out.print(" "+"   ");
               }
               for(int i=1;i<=nst;i++){
                   System.out.print("*"+"   ");
               }
               System.out.println();
               row++;
               if(row<=(n+1)/2){
                   nst+=2;
                   nsp--;
               }else{
                   nst-=2;
                   nsp++;
               }
           }
        }
}

