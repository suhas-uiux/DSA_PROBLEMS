class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder sb=new StringBuilder();
       int minlength=Math.min(word1.length(),word2.length());
      for(int i=0;i<minlength;i++){
        sb.append(word1.charAt(i));
        sb.append(word2.charAt(i));
      }
      if(word1.length()>minlength){
        sb.append(word1.substring(minlength));
      }
      else if(word2.length()>minlength){
        sb.append(word2.substring(minlength));
      }
      return sb.toString();
    }
}
