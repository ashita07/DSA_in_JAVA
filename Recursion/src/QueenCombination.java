public class QueenCombination {
    public static void main(String[] args) {
        int tq = 2;
        boolean[] arr = new boolean[4];int a=0;
        Combinate(tq, arr, "", 0,a);
    }
    public static void Combinate(int tq, boolean[] arr, String ans, int currQ, int a) {
        if (currQ == tq) {
            System.out.print(ans+" ");
            return;
        }

        for (int i = a; i < arr.length; i++){
            if(!arr[i]){
                arr[i]=true;
                Combinate(tq,arr,ans+"b"+i+"q"+currQ,currQ+1,i+1);
                arr[i]=false;
            }

        }
    }
}
