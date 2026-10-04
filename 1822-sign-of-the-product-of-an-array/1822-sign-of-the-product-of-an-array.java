class Solution {
    public int arraySign(int[] nums) {
        int c=1;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]>0)
           {
            nums[i]=1;
           }
           else if(nums[i]<0)
           {
              nums[i]=-1;
           }
           else
           {
            nums[i]=0;
           }
        }
        for(int i=0;i<nums.length;i++)
        {
            c*=nums[i];
        }
        if(c>0)
        {
            return 1;
        }
        else if(c<0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}