import java.util.Scanner;
import java.util.Arrays;
public class linearSearch1 {
    public static void main(String[] args) {
        //How your time grows as your input grows is called tolle complexity
        Scanner sc = new Scanner(System.in);
        int target=55;
        int[] arr={2,55,66,33,66,22,85,9};
        boolean ans=linearSearch(arr,target);
        System.out.println(ans);
    }

    static boolean linearSearch(int[] arr, int target) {
        if (arr.length == 0)
            return false;
        for (int index = 0; index < arr.length; index++)
        {
            int element = arr[index];
            if (element == target)
                return true;
        }
        return false;
    }
}
