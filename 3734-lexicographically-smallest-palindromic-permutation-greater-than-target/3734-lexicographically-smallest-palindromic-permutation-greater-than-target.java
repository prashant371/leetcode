class Solution {
    public String lexPalindromicPermutation(String s, String target) {

        int n = s.length();
        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int odd = 0;
        char mid = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                odd++;
                mid = (char) ('a' + i);
            }
        }

        if (odd > 1) {
            return "";
        }

        int len = n / 2;
        int[] half = new int[26];

        for (int i = 0; i < 26; i++) {
            half[i] = freq[i] / 2;
        }

        int[] count = half.clone();

        boolean possible = true;

        for (int i = 0; i < len; i++) {
            int x = target.charAt(i) - 'a';

            if (count[x] == 0) {
                possible = false;
                break;
            }

            count[x]--;
        }

        if (possible) {

            String first = target.substring(0, len);
            String ans = makePalindrome(first, mid);

            if (ans.compareTo(target) > 0) {
                return ans;
            }
        }

        for (int i = len - 1; i >= 0; i--) {

            count = half.clone();
            boolean valid = true;

            for (int j = 0; j < i; j++) {

                int x = target.charAt(j) - 'a';

                if (count[x] == 0) {
                    valid = false;
                    break;
                }

                count[x]--;
            }

            if (!valid) {
                continue;
            }

            int x = target.charAt(i) - 'a';

            for (int j = x + 1; j < 26; j++) {

                if (count[j] > 0) {

                    StringBuilder first = new StringBuilder();

                    first.append(target, 0, i);
                    first.append((char) ('a' + j));

                    count[j]--;

                    for (int k = 0; k < 26; k++) {
                        while (count[k] > 0) {
                            first.append((char) ('a' + k));
                            count[k]--;
                        }
                    }

                    return makePalindrome(first.toString(), mid);
                }
            }
        }

        return "";
    }

    public String makePalindrome(String first, char mid) {

        StringBuilder ans = new StringBuilder();

        ans.append(first);

        if (mid != 0) {
            ans.append(mid);
        }

        for (int i = first.length() - 1; i >= 0; i--) {
            ans.append(first.charAt(i));
        }

        return ans.toString();
    }
}