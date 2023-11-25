
import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int [] arr={0,-33,-2,6};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int [] arr )
    {
        for (int i=0; i< arr.length-1 ;i++)
        {
            for(int j=i+1; j>0; j--)
            {
                if(arr[j-1]>arr[j])
                    swap(j,j-1,arr);
                else
                    break;
            }
        }
    }
    static void swap(int j, int a,int [] arr)
    {
        int swap=arr[j];
        arr[j]=arr[a];
        arr[a]=swap;
    }
}
