class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int i = 0;
       while( i<n){
           char ch = s.charAt(i);
           if( st.size() == 0 )st.push(ch);
          else  if (ch == ')'){
               char peek = st.peek();
               if( peek == '('){
                   st.pop();
               }
               else st.push(ch);
           }
           else st.push(ch);
           i++;
       }
       return st.size();
            }
}