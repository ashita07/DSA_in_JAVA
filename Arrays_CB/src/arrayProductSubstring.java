public class arrayProductSubstring {
    public static void main(String[] args) {
       int ans= maxProduct(new int[] {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0});
        System.out.println(ans);
    }
    public static int maxProduct(int[] nums) {
        double suffix=1;
        double prefix=1;
        double max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix*=nums[i];
            suffix*=nums[nums.length-i-1];
            max=Math.max(max,Math.max(prefix,suffix));
        }
        return (int)max;
    }
}
