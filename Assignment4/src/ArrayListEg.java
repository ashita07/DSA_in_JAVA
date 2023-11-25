import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEg {
    public static void main(String[] args) {
        //syntax ArrayList<Integer> list = new ArrayList<>(66);
        ArrayList<Integer> list = new ArrayList<>(2);

        list.add(44);
        list.add(42);
        list.add(22);
        System.out.println(list.contains(41));
        System.out.println(list);
        list.set(0,99);
        list.remove(2);
        System.out.println(list);
      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            list1.add(sc.nextInt());
        }
       for (int j=0;j<10;j++)
        {
            System.out.println(list1.get(j));
        }
       System.out.println(list1);
    }
}
