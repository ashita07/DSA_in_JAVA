public class Leetcode_11 {
    public static void main(String[] args) {
        int [] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int max=0;int area=0;
        int n=height.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                area=(j-i)*Math.min(height[i],height[j]);
                if(area>max){
                    max=area;
                }
            }
        }
        return max;
    }
}
