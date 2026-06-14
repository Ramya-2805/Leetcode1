class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String token:tokens){
            if(token.equals("+")){
                int a=st.pop();
                int b=st.pop();
                int res=(b+a);
                st.push(res);
            }
            else if(token.equals("-")){
                int a=st.pop();
                int b=st.pop();
                int res=(b-a);
                st.push(res);
            }
            else if(token.equals("*")){
                int a=st.pop();
                int b=st.pop();
                int res=(b*a);
                st.push(res);
            }
            else if(token.equals("/")){
                int a=st.pop();
                int b=st.pop();
                int res=(b/a);
                st.push(res);
            }
            else 
               {
                int element=Integer.parseInt(token);
                st.push(element);
               }
        }
        return st.peek();
    }
}