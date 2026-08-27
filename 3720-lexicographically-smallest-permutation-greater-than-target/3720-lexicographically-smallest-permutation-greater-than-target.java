class Solution {

    public String lexGreaterPermutation(String s, String target) {

        int n = s.length();
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        char[] ans = new char[n];
        for (int i = 0; i < n; i++) {

            int current = target.charAt(i) - 'a';

            if (freq[current] > 0) {
                ans[i] = target.charAt(i);
                freq[current]--;
            } 
            else {
                for (int c = current + 1; c < 26; c++) {

                    if (freq[c] > 0) {

                        ans[i] = (char) ('a' + c);
                        freq[c]--;

                        return build(ans, i + 1, freq);
                    }
                }
                for (int j = i - 1; j >= 0; j--) {

                    freq[ans[j] - 'a']++;

                    int original = target.charAt(j) - 'a';

                    for (int c = original + 1; c < 26; c++) {

                        if (freq[c] > 0) {

                            ans[j] = (char) ('a' + c);
                            freq[c]--;

                            return build(ans, j + 1, freq);
                        }
                    }
                }

                return "";
            }
        }
        for (int i = n - 1; i >= 0; i--) {

            freq[ans[i] - 'a']++;

            int original = target.charAt(i) - 'a';

            for (int c = original + 1; c < 26; c++) {

                if (freq[c] > 0) {

                    ans[i] = (char) ('a' + c);
                    freq[c]--;

                    return build(ans, i + 1, freq);
                }
            }
        }

        return "";
    }

    private String build(char[] ans, int start, int[] freq) {

        int pos = start;
        for (int c = 0; c < 26; c++) {

            while (freq[c] > 0) {
                ans[pos++] = (char) ('a' + c);
                freq[c]--;
            }
        }

        return new String(ans);
    }
}