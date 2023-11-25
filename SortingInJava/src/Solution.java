import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
      int []  nums = {4,3,2,7,8,2,3,1};
      findDisappearedNumbers(nums);
        System.out.println(nums);
    }

    public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while( i < nums.length)
        {
          int correct=nums[i]-1;
          if( nums[i] != nums[correct] )
          swap(i,correct,nums);
          else 
          i++;
        }
        ArrayList<Integer> ans= new ArrayList<>();
        for(int index =0;index< nums.length;index++)
        {
            if(index != nums[index]-1)
            ans.add(index+1);
        }
        return ans;
    }
     static void swap(int i,int correct,int [] nums)
    {
        int swap = nums[i];
        nums[i] =nums[correct];
        nums[correct]=swap;
    }
}