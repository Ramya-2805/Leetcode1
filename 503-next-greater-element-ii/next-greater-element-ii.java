class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int [] ans=new int [n];
        int [] duplicate=new int[2*n];
        for(int i=0;i<n;i++){
            duplicate[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            duplicate[n+i]=nums[i];
        }
        for(int i=0;i<n;i++){
            boolean nge=false;
            for(int j=i+1;j<2*n;j++){
            if(duplicate[j]>nums[i]){
                ans[i]=duplicate[j];
                nge=true;
                break;
            }
            if(nge==false){
                ans[i]=-1;
            }
        }
        }
        return ans;
    }
}