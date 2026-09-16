class Solution {
    public String interpret(String s) {
        String n = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'G') {
                n = n + "G";
            } else if (ch == '(' && s.charAt(i + 1) == ')') {
                n = n + "o";
                i++;
            } else if (ch == '(' && s.charAt(i + 1) == 'a') {
                n = n + "al";
                i += 3;
            }
        }

        return n;
    }
}