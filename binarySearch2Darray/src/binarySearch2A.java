import java.util.Arrays;

public class binarySearch2A {
    public static void main(String[] args) {
        //Binary search first program
        int [][] arr={
                {4,6,9},
                {10,12,14},
                {11,15,17},
                {14,16,19}
        };
        System.out.println(Arrays.toString(search(arr,19)));
    }
    static int[] search(int[][] matrix,int target)
    {
        int row=0;
        int column=matrix[0].length-1;

        while (row < matrix.length && column>=0) {
            if (matrix[row][column] == target) {
                return new int[]{row, column};
            } else if (target > matrix[row][column]) {
                row += 1;
            } else if (target < matrix[row][column]) {
                column -= 1;
            }
        }
            return new int[]{-1, -1};

    }
}
