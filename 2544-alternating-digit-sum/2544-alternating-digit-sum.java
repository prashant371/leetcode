class Solution {
    public int alternateDigitSum(int n) {
        int digit=(int)(Math.log10(n))+1;
        int sum=0;
        for(int i=1;i<=digit;i++)
        {
            int mod=n/((int)Math.pow(10,digit-i));
               if(i%2!=0)
               {
                  sum=sum+mod;
                  n= n%((int)Math.pow(10, digit - i));
               }
               else
               {
                sum=sum-mod;
               n= n%((int)Math.pow(10, digit - i));
               }
        }

  return sum;  }
}