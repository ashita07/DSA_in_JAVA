public class searchMountainInArray {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int ans =peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    static int peakIndexInMountainArray(int[] arr)
    {int mid=-1;
        int start=0;
        int end=arr.length-1;
        while(start<end-1)
        {
            mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
                end=mid;
            else if(arr[mid]<arr[mid+1])
                start=mid;
        }
        return end;
    }
}
