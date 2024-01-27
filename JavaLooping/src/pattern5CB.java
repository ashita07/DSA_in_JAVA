import java.util.*;
public class pattern5CB {


        public static void main(String args[]) {
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();
            int row =1;
            int a=1;
            while(row<=n){
                for(int i=1;i<=row;i++){
                    System.out.print(a + "   ");
                    a++;
                }
                System.out.println();
                row++;

            }
        }
    }


