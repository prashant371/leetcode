class Solution {

    public int maximumValue(String[] strs) {

        int ans[] = new int[strs.length];

        for(int i=0;i<strs.length;i++)
        {
            int count=0;
            boolean digit=true;

            for(int j=0;j<strs[i].length();j++)
            {
                char ch=strs[i].charAt(j);

                if(ch>='a' && ch<='z')
                {
                    digit=false;
                }
                else
                {
                    count=count*10+(ch-'0');
                }
            }

            if(digit)
            {
                ans[i]=count;
            }
            else
            {
                ans[i]=strs[i].length();
            }
        }

        int max=0;

        for(int i=0;i<ans.length;i++)
        {
            if(ans[i]>max)
            {
                max=ans[i];
            }
        }

        return max;
    }
}