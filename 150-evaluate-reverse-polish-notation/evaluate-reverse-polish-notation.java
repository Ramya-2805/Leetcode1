class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String toke:tokens){
            
            if(toke.equals("+")){
                int a=st.pop();
                int b=st.pop();
                int res=(b+a);
                st.push(res);
            }
            else if(toke.equals("-")){
                int a=st.pop();
                int b=st.pop();
                int res=(b-a);
                st.push(res);
            }
            else if(toke.equals("*")){
                int a=st.pop();
                int b=st.pop();
                int res=(b*a);
                st.push(res);
            }
            else if(toke.equals("/")){
                int a=st.pop();
                int b=st.pop();
                int res=(b/a);
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(toke));
            }
        }
        return st.peek();
        }
 }
        
    
