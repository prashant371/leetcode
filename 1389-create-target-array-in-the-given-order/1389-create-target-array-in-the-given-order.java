class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int t = index[i];

            for (int j = nums.length - 1; j > t; j--) {
                ans[j] = ans[j - 1];
            }

            ans[t] = nums[i];
        }

        return ans;
    }
}