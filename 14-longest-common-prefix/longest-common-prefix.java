class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i=0;
        int s=strs.length;
        while(strs[0].length()>i){
            for(int j=1;j<s;j++){
                if(strs[j].length()<=i||strs[j].charAt(i)!=strs[0].charAt(i)){
                    
                    return strs[0].substring(0,i);
                }
            }
            i++;
        }
        return strs[0];
    }
}