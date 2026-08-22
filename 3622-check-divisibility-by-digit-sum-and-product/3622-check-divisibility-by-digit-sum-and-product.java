class Solution {
    public boolean checkDivisibility(int n) {

        int sum = 0;
        int prod = 1;
        int num = n;

        while (num > 0) {
            int temp = num % 10;

            prod *= temp;
            sum += temp;

            num /= 10;
        }

        int add = sum + prod;

        return n % add == 0;
    }
}