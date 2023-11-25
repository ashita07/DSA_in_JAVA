import java.util.Arrays;

 class selectionSort {
    public static void main(String[] args) {
        int [] arr={1,7,6,4,2,8,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int arr[])
    { int min=arr[0];int minIn=0;
    for(int i=0;i<arr.length;i++)
    {min=arr[i];
        for(int j=i;j<arr.length;j++)
        {
            if(min>=arr[j])
            {    min =arr[j];
            minIn=j;}
        }
        swap(arr,i,min,minIn);
    }
    }
    static void swap(int arr[],int i,int min,int minIn)
    {
     int swap;
     swap=arr[i];
     arr[i]=min;
     arr[minIn]=swap;
    }
}
