class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int odd = 0;
        int even = Integer.MAX_VALUE;

        for (int f : freq) {
            if (f % 2 == 1) {
                odd = Math.max(odd, f);
            } else if (f > 0) {
                even = Math.min(even, f);
            }
        }

        return odd - even;
    }
}