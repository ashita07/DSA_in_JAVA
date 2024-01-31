import java.util.*;
public class PatternCB8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp = n-1;
        int nst = 1;

        while(row<=2*n-1){

            for(int i=1;i<=nsp;i++){
                System.out.print(" "+ "    ");
            }
            int x=row;int a=0;

            for(int i=1;i<=nst;i++){

                if(i<=(nst+1)/2){
                System.out.print(x+"    ");
                ++x;a=x-1;
                }
                else{

                    System.out.print(--a+"    ");
                }
            }
            System.out.println();
            row++;

            if(row<=n){
                nsp--;
            nst+=2;
            }else{
                nsp++;
                nst-=2;
            }

        }
    }
}
