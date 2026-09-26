class Solution {
    public String sortSentence(String s) {

        String[] arr = new String[9];
        String n = "";

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch != ' ') {
                n = n + ch;
            }
            else {
                int pos = n.charAt(n.length() - 1) - '0';
                arr[pos - 1] = n.substring(0, n.length() - 1);
                n = "";
            }
        }

        int pos = n.charAt(n.length() - 1) - '0';
        arr[pos - 1] = n.substring(0, n.length() - 1);

        String ans = "";

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != null) {
                ans = ans + arr[i] + " ";
            }
        }

        return ans.trim();
    }
}