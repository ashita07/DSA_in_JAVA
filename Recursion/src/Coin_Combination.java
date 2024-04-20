public class Coin_Combination {
    public static void main(String[] args) {
        int[] coin ={2,3,5};
        int amount=7;
        int a=0;
        Combination(coin,amount,"",a);
    }

    public static void Combination(int[] coins,int amt,String ans,int a) {
        if(amt==0){
            System.out.println(ans);
            return ;
        }
        for (int i = a; i <coins.length ; i++) {
            if(amt<coins[i]){
                return ;
            }
            amt=amt-coins[i];
            Combination(coins,amt,ans+coins[i],i);
            amt=amt+coins[i];
        }

    }
}
