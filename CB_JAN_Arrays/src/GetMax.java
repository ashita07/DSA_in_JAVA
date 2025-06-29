public class GetMax {
    public static void main(String[] args) {
        int[] arr1={2,4,5,8,10};
        int[]  arr2={4,6,8,9};
int ans=maxSum(arr1,arr2);
        System.out.println(ans);
    }
    public static int maxSum(int[] nums1, int[] nums2) {
     int s1=0;int s2=0;
     int i=0;int j=0;int ans=0;
     int mod=1000_000_007;
     while(i<nums1.length && j<nums2.length){

         if(nums1[i]<nums2[j]){
             i++;
         }
         else if(nums1[i]>nums2[j]){
             j++;
         }
         else{
            int sum1=Sum(nums1,s1,i);
            int sum2=Sum(nums2,s2,j);
            ans+=Math.max(sum1,sum2);

            s1=i+1;
            s2=j+1;
            i++;j++;
         }
     }

     int sum1=Sum(nums1,s1,nums1.length-1);
     int sum2=Sum(nums2,s2,nums2.length-1);
     ans+=Math.max(sum1,sum2);


        return ans;
    }

    public static int Sum(int[] arr,int i,int j){
     int sum=0;
        for(int a=i;a<=j;a++){
        sum+=arr[a];
        }
        return sum;
    }

}
