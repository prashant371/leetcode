class Solution {
    public int firstUniqChar(String s) {

        for (int j = 0; j < s.length(); j++) {

            boolean unique = true;

            for (int i = 0; i < s.length(); i++) {

                if (j != i && s.charAt(j) == s.charAt(i)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                return j;
            }
        }

        return -1;
    }
}