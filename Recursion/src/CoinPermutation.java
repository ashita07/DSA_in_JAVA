public class CoinPermutation {
    public static void main(String[] args) {
        int[] coin ={2,3,5};
        int amount=5;
        Permutate(coin,amount,"");
    }

    public static void Permutate(int[] coins,int amt,String ans) {
        if(amt==0){
            System.out.println(ans);
            return ;
        }
        for (int i = 0; i <coins.length ; i++) {
            if(amt<coins[i]){
                return ;
            }
            Permutate(coins,amt-coins[i],ans+coins[i]);
        }

    }
}
