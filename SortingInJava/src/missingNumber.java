class missingNumber {
    public static void main(String[] args) {
        int [] arr={4,3,1,0,5,6};
       int c= missing(arr);
        System.out.println(c);
    }
    static int missing(int[] nums) {
        int i=0;
        while(i< nums.length)
        {
            if(nums[i]<nums.length && nums[i] != i)
            {
                swap(i,nums[i],nums);
            }
            else
            i++;
        }
        for(int x=0;x<nums.length;x++)
        {
            if(x!=nums[x])
            return x;
        }
        return nums.length;
    }
    static int swap(int i ,int a , int [] arr)
    {
       int swap = a;
       arr[i]=arr[a];
       arr[a]=swap;
       return 0;
    }
}