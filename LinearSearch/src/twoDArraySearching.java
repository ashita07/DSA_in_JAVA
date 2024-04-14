import java.util.Arrays;

public class twoDArraySearching {
    public static void main(String[] args) {
        int[][] arr={
                {1,6,69,88,5,0},
                {9,99,6,7,2,55,2},
                {12,77,56,87,33,44,33,2},
                {22,43,55,67,4}
                    };
        int target =96;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target)
    {
        if(arr.length==0)
            return new int[]{-1,-1};
        for(int row=0;row<arr.length;row++)
        {
          for(int col=0;col<arr[row].length;col++)
          {
              if (arr[row][col]==target) {
                 return new int[]{row,col};
              }
          }}
            return new int[] {-1,-1};
    }}

