class Solution {
    public int smallestIndex(int[] nums) {
        int sum=0;int t=-1;
        for(int i=0;i<nums.length;i++)
        {
             sum=digit(nums[i]);
            if(sum==i)
            {
                t=i;
                break;
            }
       }
   return t; }
    int digit(int n)
    {
        int s=0;
        while(n>0)
        {
        s=s+n%10;
        n=n/10;
        }
        return s;
    }
}