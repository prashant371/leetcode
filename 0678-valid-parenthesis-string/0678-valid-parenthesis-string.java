class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> str = new Stack();
        Stack<Integer> star = new Stack();

        int count = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                str.push(i);
                count++;
            }
            else if (ch == '*') {
                star.push(i);
                count2++;
            }
            else if (ch == ')') {
                count1++;

                if (!str.isEmpty()) {
                    str.pop();
                    count--;
                }
                else if (!star.isEmpty()) {
                    star.pop();
                    count2--;
                }
                else {
                    return false;
                }
            }
        }

        while (!str.isEmpty() && !star.isEmpty()) {
            if (str.peek() > star.peek()) {
                return false;
            }

            str.pop();
            star.pop();
        }

        if (str.isEmpty()) {
            return true;
        }

       return false;
    }
}