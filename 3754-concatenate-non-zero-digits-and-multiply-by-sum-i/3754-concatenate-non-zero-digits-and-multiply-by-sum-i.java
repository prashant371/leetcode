class Solution {

    public long sumAndMultiply(int n) {

        String nonZeroString;
        long nonZeroInt;

        if (String.valueOf(n).replace("0", "").isEmpty()) {
            nonZeroInt = 0L;
        } else {
            nonZeroString = String.valueOf(n).replace("0", "");
            nonZeroInt = Long.parseLong(nonZeroString);
        }

        long sum = 0L;
        long rem = 0L;
        long x = nonZeroInt;

        while (nonZeroInt > 0) {

            rem = nonZeroInt % 10;
            sum = sum + rem;
            nonZeroInt = nonZeroInt / 10;
        }

        return x * sum;
    }
}