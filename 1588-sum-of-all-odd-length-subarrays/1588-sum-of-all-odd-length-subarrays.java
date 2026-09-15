class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int j = 3; j <= arr.length; j += 2) {
            for (int i = 0; i + j <= arr.length; i++) {
                for (int k = i; k < i + j; k++) {
                    sum += arr[k];
                }
            }
        }

        return sum;
    }
}