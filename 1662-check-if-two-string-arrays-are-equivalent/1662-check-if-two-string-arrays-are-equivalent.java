class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        boolean w = false;
        String s1 = "";
        String s2 = "";

        for(int i = 0; i < w1.length; i++) {
            s1 = s1 + w1[i];
        }

        for(int i = 0; i < w2.length; i++) {
            s2 = s2 + w2[i];
        }

        if(s1.equals(s2)) {
            w = true;
        }

        return w;
    }
}