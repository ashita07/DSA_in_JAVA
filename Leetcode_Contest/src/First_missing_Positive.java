public class First_missing_Positive {
    public static void main(String[] args) {
         int[] arr={7,2,3,6,1,5,4};
         int ans=firstMissingPositiv(arr);
        System.out.println(ans);
    }

    public static int firstMissingPositiv(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i + 1 || nums[i] <= 0 || nums[i] > nums.length) {
                i++;
            } else if (nums[i] == nums[nums[i] - 1]) {
                i++;
            } else {
                int a = nums[i];
                nums[i] = nums[a - 1];
                nums[a - 1] = a;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] - 1 != j) {
                return j + 1;
            }
        }
        return nums.length + 1;
    }

}
