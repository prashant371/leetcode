class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1000000007;

        long count = 1;
        long[] last = new long[26];

        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 'a';

            long newCount = (count * 2) % MOD;

            newCount = (newCount - last[ch] + MOD) % MOD;

            last[ch] = count;
            count = newCount;
        }

        return (int) ((count - 1 + MOD) % MOD);
    }
}