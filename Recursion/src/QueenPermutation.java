import java.sql.SQLOutput;

public class QueenPermutation {
    public static void main(String[] args) {
        int tq = 2;
        boolean[] arr = new boolean[4];
        Permute(tq, arr, "", 0);
    }

    public static void Permute(int tq, boolean[] arr, String ans, int currQ) {
        if (currQ == tq) {
            System.out.print(ans+" ");
            return;
        }
        for (int i = 0; i < arr.length; i++){
        if(!arr[i]){
           arr[i]=true;
           Permute(tq,arr,ans+"b"+i+"q"+currQ,currQ+1);
           arr[i]=false;
        }

        }
    }
}