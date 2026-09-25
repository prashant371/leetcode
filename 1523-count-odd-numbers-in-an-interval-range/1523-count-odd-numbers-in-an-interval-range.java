class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        int i=low;
        if(low==high&&low%2==0)
        return 0;
        while(i<=high)
        {
              count++;
            if(low%2==0&&high%2==0)
            {
                low=low+1;
               high=high-1;
            }
            i=i+2;
        }
  return count;  }
}