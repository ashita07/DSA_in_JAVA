import java.util.Scanner;
public class A2q24sumtill
{
    public static void main(String[] args) {
        int sum=0;Scanner a=new Scanner(System.in);
       int lar=0;
        while(true )
        {
          int x=a.nextInt();
          sum+=x;
          if(x>lar)
              lar=x;
          if(x==0) break;
        }
        System.out.println(sum);
        System.out.println(lar);
    }
}
