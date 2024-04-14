import java.util.ArrayList;
import java.util.Scanner;

public class doubleArrayList {
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> list =new ArrayList<>(10);
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
           list.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
