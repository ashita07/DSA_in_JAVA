import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_Contest131 {
    public static void main(String[] args) {
         int[] ans=occurrencesOfElement(new int[]{1, 4, 5, 6, 1, 1, 8, 6, 1, 4}, new int[]{2, 4, 5, 1},1);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> occurrences = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == x) {
                occurrences.add(i);
            }
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; ++i) {
            if (queries[i] <= occurrences.size()) {
                result[i] = occurrences.get(queries[i] - 1);
            } else {
                result[i] = -1;
            }
        }

        return result;
    }
}
