class Solution {
    public int maxProfit(int[] prices) {
      int n=prices.length;
      int count=0;
      for(int i=0;i<n-1;i++){
        if(prices[i]>prices[i+1] )continue;
        count+=prices[i+1]-prices[i];
      }  
      return count;
    }
}