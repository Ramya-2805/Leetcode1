class Solution {
    public int[] sortArray(int[] nums) {
         mergeSort(nums,0,nums.length-1);
         return nums;
    }
        public void mergeSort(int [] nums,int low,int high){
        if(low>=high){ return ;
               }
       int mid=(low+high)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        sort(nums,low,high,mid);
    }
    public void sort(int[] nums,int low,int high,int mid){
        int i=low;
        int j=mid+1;
        int[] ans=new int[high-low+1];
        int k=0;
        while(i<=mid && j<=high){
            if(nums[i]<nums[j]){
                ans[k]=nums[i];
                i++;
            }
            else{
                ans[k]=nums[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            ans[k]=nums[i];
            i++;
            k++;
        }
        while(j<=high){
            ans[k]=nums[j];
            j++;
            k++;
        }
        for(int x=0;x<ans.length;x++){
            nums[low+x]=ans[x];
        }
    }
}