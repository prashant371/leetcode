class Solution {

    public boolean sumGame(String num) {

        int i = 0;
        boolean w = false;

        int n = 0;
        int e = 0;

        int leftQ = 0;
        int rightQ = 0;

        int mid = num.length() / 2;

        while (i < num.length()) {

            if (num.charAt(i) == '?') {

                if (i < mid) {
                    leftQ++;
                } else {
                    rightQ++;
                }

            } else {

                if (i < mid) {
                    n = n + (num.charAt(i) - '0');
                } else {
                    e = e + (num.charAt(i) - '0');
                }
            }

            i++;
        }

        int difference = n - e;
        int questionDifference = rightQ - leftQ;

        if (difference * 2 != questionDifference * 9) {
            w = true;
        }

        return w;
    }
}