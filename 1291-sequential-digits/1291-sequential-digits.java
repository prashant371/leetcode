class Solution {

    public List<Integer> sequentialDigits(int low, int high) {

        ArrayList<Integer> list = new ArrayList<>();
        String str = "123456789";

        for (int len = 2; len <= 9; len++) {

            for (int start = 0; start + len <= 9; start++) {

                int num = Integer.parseInt(str.substring(start, start + len));

                if (num >= low && num <= high) {
                    list.add(num);
                }
            }
        }

        return list;
    }
}