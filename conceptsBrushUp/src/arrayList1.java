import java.util.ArrayList;
import java.util.Scanner;

public class arrayList1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a= new ArrayList<>();
        a.add(22);
        a.add(234);
        System.out.println(a);
        System.out.println(a.get(1));
        ArrayList<Integer> b= new ArrayList<>(5);
        for(int i=0;i<=5;i++)
        {
            b.add(sc.nextInt());
        }
        System.out.println(b);
    }
}
