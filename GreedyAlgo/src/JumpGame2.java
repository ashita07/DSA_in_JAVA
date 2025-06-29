public class JumpGame2 {
    public static void main(String[] args) {
   int a=jumps(0,0,new int[] {5,6,4,4,6,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,7,6,5,3,3,7,3});
        System.out.println(a);
    }
    public static int  jumps(int j,int i,int[] nums){
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        if(i==n-1){
            return j;
        }
        for(int a=1;a<=nums[i] && i+a<n;a++){
            int c=jumps(j+1,i+a,nums);
            min=Math.min(c,min) ;
        }
        return min;
    }
}
