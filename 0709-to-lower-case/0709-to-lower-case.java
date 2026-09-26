class Solution {
    public String toLowerCase(String s) {

        StringBuilder str = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++) {

            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
                str.setCharAt(i, ch);
            }
        }

        return str.toString();
    }
}