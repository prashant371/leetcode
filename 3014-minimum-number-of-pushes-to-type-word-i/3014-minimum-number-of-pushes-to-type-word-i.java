class Solution {
    public int minimumPushes(String word) {
        int result =0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int ass=2;
        for(char ch:word.toCharArray())
        {
            if(ass>9)
            {
                ass=2;
            }
            int push=map.getOrDefault(ass,0)+1;
            map.put(ass,push);

            result +=push;
            ass++;
        }
   return result; }
}