class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return helper(nums,dp,0,n);

    }
    public int helper(int[] nums,int[] dp, int index,int n){
        if(index>=n) return 0;
        if(dp[index]!=-1 ) return dp[index];
        int take=nums[index]+helper(nums,dp,index+2,n);
        int nottake=helper(nums,dp,index+1,n);
        dp[index]=Math.max(take,nottake);
        return dp[index];
    }
}
//Memoization