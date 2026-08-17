class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int t = 0;
        int arr[] = new int[nums.length];

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                arr[t] = nums[j];
                t++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                arr[t] = nums[i];
                t++;
            }
        }

        return arr;
    }
}