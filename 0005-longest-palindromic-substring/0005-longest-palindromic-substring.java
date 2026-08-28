class Solution {

    public String longestPalindrome(String s) {

        int max = 0;
        String ans = "";

        for (int start = 0; start < s.length(); start++) {

            for (int end = s.length() - 1; end >= start; end--) {

                int i = start;
                int e = end;

                while (i < e && s.charAt(i) == s.charAt(e)) {
                    i++;
                    e--;
                }

                if (i >= e) {

                    if (end - start + 1 > max) {
                        max = end - start + 1;
                        ans = s.substring(start, end + 1);
                    }

                    break;
                }
            }
        }

        return ans;
    }
}