class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res=new ArrayList<>();
       int maxLen=0;
        for(int i=0;i<candies.length;i++){
            maxLen=Math.max(maxLen,candies[i]);
           
        }
        for(int i=0;i<candies.length;i++){
            res.add(candies[i]+extraCandies>=maxLen);
        }
        return res;
        
    }
}
