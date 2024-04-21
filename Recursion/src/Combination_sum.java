import java.util.ArrayList;
import java.util.List;

public class Combination_sum {
    public static void main(String[] args) {
        int sum=7;
        int[] coin ={2,3,5};
        int a=0;
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ll= new ArrayList<>();
        Combination(coin,sum,a,ll,ans);
        System.out.println(ans);
    }

    public static void Combination(int[] coin,int sum,int a,List<Integer> ll,List<List<Integer>> ans) {
        if(sum==0){
          //  System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i=a;i<coin.length;i++){
            if(coin[i]>sum){
                return;
            }
            ll.add(coin[i]);
            Combination(coin,sum-coin[i],i,ll,ans);
            ll.remove(ll.size()-1);
        }

    }
}
