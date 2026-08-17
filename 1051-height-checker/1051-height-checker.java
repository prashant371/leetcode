class Solution {
    public int heightChecker(int[] heights) {
        int copy[] = heights.clone();
        int t = 0;

        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = 0; j < heights.length - 1 - i; j++) {

                if (heights[j] > heights[j + 1]) {
                    t = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = t;
                }
            }
        }

        int c = 0;

        for (int i = 0; i < copy.length; i++) {
            if (copy[i] != heights[i]) {
                c++;
            }
        }

        return c;
    }
}