import java.util.Arrays;

public class bubbleSort
{//also known as sinking sort or exchange sort
    public static void main(String[] args) {
     int [] arr={1,3,2,5,6,7,8,4};
     bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
   static void bubble(int arr[])
    { int swap;
        boolean a=false;
        for(int i=0;i<arr.length;i++)
        { a=false;
            for(int j=1;j<arr.length-i ;j++)
            {
                if(arr[j]<arr[j-1])
                { a=true;
                 swap=arr[j];
                 arr[j]=arr[j-1];
                 arr[j-1]=swap;
                }
            }
                if(!a)
                break;
        }
    }
}
