class Solution {
    public int waysToMakeFair(int[] nums) {
        int n=nums.length;
        int [] even=new int[n];
        int [] odd=new int[n];
        even[0]=nums[0];
        for(int i=1;i<n;i++){
            even[i]=even[i-1];
            odd[i]=odd[i-1];
            if(i%2==0){
                even[i]+=nums[i];

            }
            else{
                odd[i]+=nums[i];
            }
        }
        int ans = 0;

        for (int i = 0; i < n; i++) {

            int leftEven = (i == 0) ? 0 : even[i - 1];
            int leftOdd = (i == 0) ? 0 : odd[i - 1];

            int rightEven = even[n - 1] - even[i];
            int rightOdd = odd[n - 1] - odd[i];

            int newEven = leftEven + rightOdd;
            int newOdd = leftOdd + rightEven;

            if (newEven == newOdd) {
                ans++;
            }
        }

        return ans;
    }
}
    
