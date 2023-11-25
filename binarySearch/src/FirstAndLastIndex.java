import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int [] nums={5,7,7,7,7,8,8,10};
        int target=8;
        int [] ans=searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
        static int[] searchRange(int[] nums, int target) {
            int start =0;int a=-1,b=-1;
           // int[] arr={a,b};
            int end =nums.length-1;
            while(start<=end)
            {
                int  mid=start+(end-start)/2;
                if(nums[mid]==target)
                {   start=0;
                    end=mid-1 ;
                    if(nums[end]==target)
                    {  mid=start+(end-start)/2;
                        if(nums[mid]==target)
                            end=mid-1;
                        else a=mid+1;}
                    else
                        a=mid;
                }
                if(nums[mid]>target)
                    end=mid-1;
                else
                    start=mid+1;
            }
            start=0;end=nums.length-1;
            while(start<=end)
            {
                int  mid=start+(end-start)/2;
                if(nums[mid]==target)
                {
                    start=mid+1;
                    if(nums[start]==target)
                    { mid=start+(end-start)/2;
                    if(nums[mid]==target)
                        start=mid+1;
                    else
                        b=mid-1;}
                    else
                        b=mid;
                }
                if(nums[mid]>target)
                    end=mid-1;
                else
                    start=mid+1;
            }
            return new int[] {a,b};
        }
    }

