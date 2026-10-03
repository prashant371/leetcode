class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> str = new Stack<>();
        str.push(-1);

        int c = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                str.push(i);
            }
            else {
                str.pop();

                if(str.isEmpty()) {
                    str.push(i);
                }
                else {
                    c = Math.max(c, i - str.peek());
                }
            }
        }

        return c;
    }
}