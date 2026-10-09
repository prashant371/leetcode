class Solution {
    public int minInsertions(String s) {
        int count = 0;
        int insertions = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (count % 2 != 0) {
                    count--;
                    insertions++;
                }
                count += 2;
            } else {
                count--;
                if (count < 0) {
                    insertions++;
                    count = 1;
                }
            }
        }

        return insertions + count;
    }
}