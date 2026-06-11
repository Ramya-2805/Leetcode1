class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int minprice=prices[0];
        for(int i=0;i<n;i++){
            minprice=Math.min(minprice,prices[i]);
            profit=Math.max(profit,prices[i]-minprice);                                                                                                                                                                          


        }
        return profit;
    }
}