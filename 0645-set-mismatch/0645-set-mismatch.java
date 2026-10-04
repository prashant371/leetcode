class Solution {
    public int[] findErrorNums(int[] nums) {

        int ans[] = new int[2];

        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]==nums[i+1]) {
                ans[0]=nums[i];
            }
        }

        for(int i=1;i<=nums.length;i++) {
            boolean found=false;

            for(int j=0;j<nums.length;j++) {
                if(nums[j]==i) {
                    found=true;
                    break;
                }
            }

            if(!found) {
                ans[1]=i;
                break;
            }
        }

        return ans;
    }
}