class Solution {
  int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0;
        int right=0;
        int ans=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(right<n){
            char ch=s.charAt(right);
        if(map.containsKey(ch)){
            left=Math.max(left,map.get(ch)+1);
        }
        map.put(ch,right);
        ans=Math.max(ans,right-left+1);
        right++;

    }
    return ans;
}
}