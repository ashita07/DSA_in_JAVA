import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,1,1,2,2,3};
            int[] a=removeDuplicates(arr);
            System.out.println(Arrays.toString(a));
        }
        public static int[] removeDuplicates(int[] nums) {
            int j=0;
            for(int i=0;i<nums.length;i++){
                if(i==0 || i==1 || nums[j-2] != nums[i])
                { nums[j]=nums[i];
                    j++;}
            }
            return nums;
        }
    }
