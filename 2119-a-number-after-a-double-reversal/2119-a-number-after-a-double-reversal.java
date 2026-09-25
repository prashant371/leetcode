class Solution {
    public boolean isSameAfterReversals(int n) {
        int original = n;
        int t = 0;
        int r;
        int p = 0;

        while(n > 0) {
            r = n % 10;
            t = t * 10 + r;
            n = n / 10;
        }

        while(t > 0) {
            r = t % 10;
            p = p * 10 + r;
            t = t / 10;
        }

        return p == original;
    }
}