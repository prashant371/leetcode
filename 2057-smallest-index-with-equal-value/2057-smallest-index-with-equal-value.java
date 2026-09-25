class Solution {
    public int smallestEqual(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%10==nums[i])
            {
                c=i;
                break;
            }
            else 
            {
                c=-1;
            }
        }
        if(c==nums.length)
          c=0;
   return c; }
}