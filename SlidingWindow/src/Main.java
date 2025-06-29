public class Main {
    public static void main(String[] args) {

        System.out.println(numSubarrayProductLessThanK(new int[]{10,5,2,6,2,4,5,3},12)) ;
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int s=0;
        int e=0;
        int p=1;
        int c=0;
        while(s<nums.length ){
            p*=nums[s];
            if(p<k){
                c=c+s-e+1;
                s++;
            }
            else if(p>=k){
                while(p>=k)
                { p=p/nums[e];
                    e++;}
                if(p<k)
                    c=c+(s-e)+1;
                s++;
            }
        }
        return c;
    }
}