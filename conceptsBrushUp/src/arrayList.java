import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static void main(String Args[])
    {Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int a=0;a>5;a++)
        {
            System.out.println("enter a number");
            arr[a]=sc.nextInt();
        }
        kidsWithCandies(arr,5);
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        ArrayList<Boolean> result =new ArrayList<Boolean>(candies.length);
        int[] extracandy = new int[candies.length];
        for(int i=0;i <candies.length;i++)
        {
            extracandy[i] = candies[i] + extraCandies;
        }
        for(int i=0;i<candies.length;i++)
        {
            if(extracandy[i]>candies[i])
                result.add(true);
            else
                result.add(false);
        }
        return result ;
    }
}