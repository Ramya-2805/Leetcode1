class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1) return false;
        char[] arr=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(char ch:arr){
            if(ch=='{'||ch=='['||ch=='('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                if((st.peek()=='{' && ch=='}')||(st.peek()=='(' && ch==')')||(st.peek()=='['&& ch==']')){
                    st.pop();
                }  
                else{
                    return false;
                }          }
        }
        return st.isEmpty()==true;
    }
}