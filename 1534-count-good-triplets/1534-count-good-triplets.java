class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int t=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                   if(i>=0&&i<j&&j<k&&k<arr.length)
                   {
                    int r=Math.abs(arr[i]-arr[j]);
                    int p=Math.abs(arr[j]-arr[k]);
                    int q=Math.abs(arr[i]-arr[k]);
                    if(r<=a&&p<=b&&q<=c)
                    {
                        t++;
                    }
                   }
                }
            }
        }
   return t; }
}