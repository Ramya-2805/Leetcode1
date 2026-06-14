class Solution {
    public int longestOnes(int[] nums, int k) {
       int n=nums.length;
       int zero=0;
       int right=0;
       int left=0;
       int Mathone=0;
     while(right<n){
         if(nums[right]==0) zero++;
         if(zero<=k) 
         Mathone=Math.max(Mathone,right-left+1);
         if(zero>k){
            while(nums[left]!=0){
                left++;
            }
            left++;
            zero--;
         }
         right++;
       }
       return Mathone;

    }
}