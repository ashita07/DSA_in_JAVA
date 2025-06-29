public class JumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[] {3,2,1,0,4}));
    }
    public static boolean canJump(int[] nums) {
        int flag=nums.length-1;
        int i=nums.length-2;
        while(i>=0){
            if(i+nums[i] >= flag){
                flag=i;
            }
            i--;
        }
        return flag==0;
    }
}
