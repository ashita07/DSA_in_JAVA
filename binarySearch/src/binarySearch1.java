

public class binarySearch1 {
    public static void main(String[] args) {
int [] arr={33,44,65,565,888,8888,9543,12345};
int target=44;
int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int [] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
      while(start<=end)
      {
          int mid=(start+end)/2;
          if (target == arr[mid]) {
              return mid;
          }
          if (target > arr[mid]) {
              start = mid+1;
          } else {
              end = mid-1;
          }
      }
        return -1;
    }

}