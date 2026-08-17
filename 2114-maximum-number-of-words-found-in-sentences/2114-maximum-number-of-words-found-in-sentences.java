class Solution {
    public int mostWordsFound(String[] sentences) {
        int max =0;int words=0;
        for(String s:sentences){
         words =1;
          for(char ch:s.toCharArray()){
          if(ch==' '){
          words++;
    }
}
     max=Math.max(max,words);
    }
    return max;}
}