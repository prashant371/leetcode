class Solution {
    public String restoreString(String s, int[] nums) {
        StringBuilder str = new StringBuilder(s);

        for(int i=0;i<s.length();i++)
        {
            int t=nums[i];
            char ch=s.charAt(i);

            if(str.charAt(t) != ch)
            {
                str.setCharAt(t,ch);
            }
        }

        return str.toString();
    }
}