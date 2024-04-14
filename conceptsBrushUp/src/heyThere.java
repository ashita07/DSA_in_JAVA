import java.util.ArrayList;
import java.util.Scanner;

public class heyThere {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
        for (int i=0;i<10;i++){
            list.add(sc.nextInt());
        }
        list.set(0,99);
        for(int i=0;i<10;i++){
            System.out.println(list.get(i));
            System.out.println(list.contains(5));

        }
    }
}
