public class MaxProfit {
    public static void main(String[] args) {
        int arr[]={9,7,7,6,5,4};
        int ans=maxProfit(arr);
        System.out.println(ans);
    }

    public static int maxProfit(int[] prices) {
        int buy= prices[0];
        int sell=prices[0];
        int maxP=0;
        int profit=0;
        for (int i =0 ; i < prices.length ; i++)
        {
            buy=prices[i];
            for(int j=i ; j < prices.length ; j++){
                if(prices[j] > buy){
                    sell = prices[j];
                    profit=sell-buy;
                }
                if(profit > maxP)
                    maxP=profit;
            }
        }
        return maxP;
    }
}
