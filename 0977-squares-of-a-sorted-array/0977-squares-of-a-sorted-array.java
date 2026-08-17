class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = (int) Math.pow(nums[i], 2);
        }

        int big;

        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = 0; k < arr.length - 1 - j; k++) {
                if (arr[k] > arr[k + 1]) {
                    big = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = big;
                }
            }
        }

        return arr;
    }
}