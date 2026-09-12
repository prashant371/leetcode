class Solution {
    public int findNumbers(int[] nums) {
     int s=0;
        for(int i=0;i<nums.length;i++)
        {
            int c=0;
            int t=nums[i];
          while(t>0)
            {
                c++;
                t=t/10;
            }
            if(c%2==0)
            {
                s++;
            }
        }
   return s; }
}