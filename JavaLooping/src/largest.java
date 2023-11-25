import java.util.Scanner;
public class largest
{
    public static void main(String[] args) {
      Scanner in= new Scanner (System.in);
      int n1=in.nextInt();
      int n2= in.nextInt();
      int n3=in.nextInt();
    /*  if(n1>=n2 && n1>=n3) {
          System.out.println(n1);
      }
      if(n2>=n1 && n2>=n3){
          System.out.println(n2);
      }
      else System.out.println(n3);*/
      /* int max =n1;
       if(n2>max){
           max=n2;
       }
       if (n3>max)
       {
           max=n3;
       }
        System.out.println(max);*/
        int max=Math.max(n1,n2);
        int max2=Math.max(max,n3);
        System.out.println(max2);
    }
}
