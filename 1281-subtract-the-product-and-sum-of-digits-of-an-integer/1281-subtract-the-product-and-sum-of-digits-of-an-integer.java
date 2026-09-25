class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;int d=0;
        while(n>0)
        {
            int s=n%10;
            p=p*s;
            d=d+s;
            n=n/10;
        }
   return (p-d); }
}