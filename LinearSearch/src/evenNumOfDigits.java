public class evenNumOfDigits {
    public static void main(String[] args) {
int[] nums={2444,6,44,553,63,82242,5599,33,7,653,97,8,4};
int ans =findNumbers(nums);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums)
    {
        int count=0;
        for (int num:nums) {
            if(even(num))
                count++;
        }
        return count;
    }
    static boolean even(int num)
    {
       // String n=String.valueOf(num);
    String n=Integer.toString(num);
    if(n.length()%2==0)
    {return true;}
    else return false;
    }
}
