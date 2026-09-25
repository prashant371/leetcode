class Solution {
    public int countDigits(int num) {
        int n =num;
        int s=0;int t=0;
        while(n>0)
        {
          s=n%10;
          if(num%s==0)
          {
            t=t+1;
          }
          n=n/10;
        }
  return t;  }
}