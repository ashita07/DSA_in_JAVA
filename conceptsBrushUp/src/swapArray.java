import java.util.Arrays;
import java.util.Scanner;

public class swapArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int [] array={2,3,4,5,6};
        swap(array,0,4);
        System.out.println(Arrays.toString(array));


    }
    static void swap(int [] array,int in1,int in2){
int temp=array[in1];
array[in1]=array[in2];
array[in2]=temp;
    }
}
