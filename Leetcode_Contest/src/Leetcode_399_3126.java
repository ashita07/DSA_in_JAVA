public class Leetcode_399_3126 {
    public static void main(String[] args) {
        int ans = numberOfPairs(new int[]{45,9}, new int[]{2,5},9);
        System.out.println(ans);
    }
    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int c1=0;int c2=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i] % (nums2[c1]*k)==0){
                c2++;
            }
            if(i==nums1.length-1 && c1<nums2.length-1 ){
                i=-1;
                c1++;
            }
        }
        return c2;
    }
}
