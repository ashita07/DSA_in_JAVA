import java.util.Arrays;

public class NextPremutation1 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        find(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void find(int[] arr){
        int n=arr.length;
        int p=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                p=i;
                break;
            }

        }
        if(p==-1){
            reverse(arr,0,n-1);

        }
        int q=-1;
        for(int i=n-1;i>p;i--){
            if(arr[i]>arr[p]){
                q=i;
                break;
            }

        }
        int a=arr[p];
        arr[p]=arr[q];
        arr[q]=a;
        reverse(arr,p+1,n-1);

    }
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
}
