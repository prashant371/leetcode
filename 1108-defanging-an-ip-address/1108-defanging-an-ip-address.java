class Solution {
    public String defangIPaddr(String s) {
        StringBuilder str = new StringBuilder(s);

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='.')
            {
                str.insert(i, '[');
                str.insert(i+2, ']');
                i += 2;
            }
        }

        return str.toString();
    }
}