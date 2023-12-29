public class MaxSubArray {
    public static void main(String[] args) {
        int arr[]={-5,10,-6,-7};
        int ans =maxSubArray(arr);
        System.out.println(ans);
    }

        public static int maxSubArray(int[] nums) {
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;

            for (int i = 0; i < nums.length; i++) {
                currentSum += nums[i];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }

                if (currentSum < 0) {
                    currentSum = 0;
                }
            }

            return maxSum;
        }
    }

