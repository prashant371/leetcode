class Solution {
    public int minOperations(String s) {
        int n = s.length();
        if (n == 2) return s.charAt(0) <= s.charAt(1) ? 0 : -1;

        boolean sorted = true;
        char min = 'z', max = 'a';
        int minCount = 0, maxCount = 0;

        for (int i = 0; i < n; i++) {
            if (i > 0 && s.charAt(i) < s.charAt(i - 1))
                sorted = false;

            min = (char) Math.min(min, s.charAt(i));
            max = (char) Math.max(max, s.charAt(i));
        }

        if (sorted) return 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == min) minCount++;
            if (s.charAt(i) == max) maxCount++;
        }

        if (s.charAt(0) == min || s.charAt(n - 1) == max)
            return 1;

        if (s.charAt(0) == max && s.charAt(n - 1) == min
            && maxCount == 1 && minCount == 1)
            return 3;

        return 2;
    }
}