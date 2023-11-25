import java.util.Scanner;
class Solution {
    static Scanner sc =new Scanner (System.in);
   static int [] arr1= new int[5];
     static void main(String[] args)
     {
        for(int i=0;i<5;i++)
        {
            arr1[i]=sc.nextInt();
        }
        arr(arr1);
    }
     static int[] arr(int[] a)
    {   int [] ans=new int[5];
        for(int i=0;i<5;i++)
        {
            ans[i]=a[a[i]];
        }
        return ans;
    }
}