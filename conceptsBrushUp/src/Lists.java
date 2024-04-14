class Lists {

  public  static void main(String[] Args)
    {
        int ans=  maxSubArray(new int[]{-7, -9, -5});
        System.out.println(ans);
    }
     public static int maxSubArray(int[] nums)
    {
        int sum=0,f=0,result=0;
        for(int C=0;C<nums.length; C++)
        {
            result=Math.min(f,nums[C]);
        }
        for(int a=0;a<nums.length;a++)
        {sum=0;
            for (int b=a;b<nums.length;b++)
            {
                sum+=nums[b];
                if(sum>=result)
                    result=sum;
            }
        }
        return result;
    }
}