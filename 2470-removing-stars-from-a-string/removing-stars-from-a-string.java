class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        char[] arr=s.toCharArray();
        for(char op:arr){
            if(op=='*'){
                st.pop();
            }
            else{
                st.push(op);
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char op:st){
            ans.append(op);
        }
        return ans.toString();
    }
}