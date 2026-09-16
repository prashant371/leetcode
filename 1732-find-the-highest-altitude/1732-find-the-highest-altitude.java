class Solution {
    public int largestAltitude(int[] gain) {

        int arr[] = new int[gain.length + 1];

        int c = 0;
        arr[0] = 0;

        for(int i = 0; i < gain.length; i++) {
            c = c + gain[i];
            arr[i + 1] = c;
        }

        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }
}