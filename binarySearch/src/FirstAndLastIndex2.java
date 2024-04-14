import java.util.Arrays;

public class FirstAndLastIndex2 {
    public static void main(String[] args) {
int[] nums={3,3,5,6,7,7,7,7,7,8,8};
int target=7;
int[] ans =searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums,int target)
    { int[] ans={-1,-1};
        int start=search(nums,target,true);
        int end =search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
      return ans;
        }
         static int search(int [] nums,int target,boolean check)
        { int ans=-1;
            int start=0;
            int end=nums.length-1;
            while (start<=end)
            {
                int mid=start+(end-start)/2;
                if(nums[mid]>target)
                    end=mid-1;
               else if (nums[mid]<target)
                    start=mid+1;
                else {
                    ans=mid;
                    if(check)
                     end=mid-1;
                    else start=mid+1;
                }
            }
            return ans;
        }
    }

