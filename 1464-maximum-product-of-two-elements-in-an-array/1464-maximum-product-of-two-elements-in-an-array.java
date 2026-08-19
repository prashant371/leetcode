class Solution {

    public int maxProduct(int[] nums) {

        int t = 0;

        for (int j = 0; j < nums.length; j++) {

            for (int i = 0; i < nums.length - 1; i++) {

                if (nums[i] > nums[i + 1]) {

                    t = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = t;
                }
            }
        }

        return ((nums[nums.length - 1] - 1)
             * (nums[nums.length - 2] - 1));
    }
}