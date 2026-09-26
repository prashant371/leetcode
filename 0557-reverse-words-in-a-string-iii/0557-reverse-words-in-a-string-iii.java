class Solution {
    public String reverseWords(String s) {

        StringBuilder ptr = new StringBuilder(s);
        String d = "";
        String n = "";

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(ch != ' ') {
                n = n + ch;
            }
            else {
                d = d + reverse(n) + " ";
                n = "";
            }
        }

        d = d + reverse(n);

        return d;
    }

    String reverse(String r) {

        StringBuilder str = new StringBuilder(r);
        str.reverse();

        return str.toString();
    }
}