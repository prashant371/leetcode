class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        int j = 0;

        for(int i = 0; i < nums2.length && j < nums1.length; i++) {
            int t = nums1[j];

            if(t == nums2[i]) {
                for(int k = i + 1; k < nums2.length; k++) {
                    if(nums2[k] > nums2[i]) {
                        ans[j] = nums2[k];
                        break;
                    }

                    ans[j] = -1;
                }

                if(i + 1 == nums2.length) {
                    ans[j] = -1;
                }

                j++;
                i = -1;
            }
        }

        return ans;
    }
}