class Solution {
    public int countCommas(int n) {
        int ans = 0;

        if (n >= 1000) {
            ans += Math.min(n, 999999) - 1000 + 1;
        }

        if (n >= 1000000) {
            ans += (Math.min(n, 999999999) - 1000000 + 1) * 2;
        }

        if (n >= 1000000000) {
            ans += (Math.min(n, Integer.MAX_VALUE) - 1000000000 + 1) * 3;
        }

        return ans;
    }
}