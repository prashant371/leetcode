class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n=nums1.length;
        int m=nums2.length;

        int arr[]=new int[m+n];

        int j=0;
        int k=0;

        for(int i=0;i<(m+n);i++)
        {
            if(k==n)
            {
                arr[i]=nums2[j];
                j++;
            }
            else if(j==m)
            {
                arr[i]=nums1[k];
                k++;
            }
            else if(nums1[k]>nums2[j])
            {
                arr[i]=nums2[j];
                j++;
            }
            else
            {
                arr[i]=nums1[k];
                k++;
            }
        }

        double d=0.0;
        int mid=(arr.length/2);

        if(arr.length%2==0)
        {
            d=((arr[mid-1]+arr[mid])/2.0);
        }
        else
        {
            d=arr[mid];
        }

        return d;
    }
}