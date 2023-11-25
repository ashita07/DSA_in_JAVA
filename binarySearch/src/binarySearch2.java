import java.util.*;
public class binarySearch2
{//order agnostic binary search
    public static void main(String[] args) {
int[] arr={100,88,79,74,44,34,22,21,18,17,10,6,1};
int target=34;
int ans=orderagnosticBinarySearch(arr,target);
        System.out.println(ans);
    }

static int orderagnosticBinarySearch(int [] arr,int target)
{
    int start=0;
    int end =arr.length-1;
    boolean order=arr[start] < arr[end];
    while(end>=start)
    {
    int mid=start+(end - start)/2;
    if(arr[mid]==target)
        return mid;
    if(order)
    {
        if(arr[mid]>target)
            end=mid-1;
        else
            start=mid+1;
    }
    else
    {
    if(arr[mid]>target)
        start=mid+1;
    else
        end=mid-1;
    }
    }
    return -1;
}
}
