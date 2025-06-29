import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr=productExceptSelf(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(arr));
    }
    public static int[] productExceptSelf(int[] nums) {

        int n=nums.length;

        int[] arrL=new int[n];
        int[] arrR=new int[n];
        int[] answer=new int[n];
        if(n==2){
            answer[0]=nums[1];
            answer[1]=nums[0];
            return answer;
        }
        for(int i=2;i<nums.length;i++){
            arrL[0]=1;
            arrL[1]=nums[0];
            arrL[i]=arrL[i-1]*nums[i-1];
        }
        for(int i=n-3;i>=0;i--){
            arrR[n-1]=1;
            arrR[n-2]=nums[n-1];
            arrR[i]=arrR[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            answer[i]=arrL[i]*arrR[i];
        }
        return answer;
    }
}
