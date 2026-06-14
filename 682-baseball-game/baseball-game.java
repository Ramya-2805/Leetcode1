class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String op:operations){
            if(op.equals("+")){
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                st.push(b+a);
            }
            else if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
              st.push( st.peek()*2);
            }
            else{
                int element=Integer.parseInt(op);
                st.push(element);
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}