import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
     int [] arr={3,2,4,5,1};
     cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int arr[])
    {
     int i =0;
     while(i<arr.length)
     {
         int correct=arr[i]-1;
         if(arr[i] != arr[correct])
             swap(i,correct,arr);
         else  {
             i++;
         }
     }
    }
    static void swap(int i,int correct,int [] arr)
    {
        int swap=arr[i];
        arr[i]=arr[correct];
        arr[correct]=swap;
    }
}
