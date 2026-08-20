class Solution {
    public int smallestNumber(int n, int t) {

        while (true) {
            int number = n;
            int product = 1;

            while (number > 0) {
                product *= number % 10;
                number /= 10;
            }

            if (product % t == 0) {
                return n;
            }

            n++;
        }
    }
}