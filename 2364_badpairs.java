import java.util.HashMap;

class Solution {
    public long countBadPairs(int[] nums) {
        long n=nums.length;
        HashMap<Integer,Long> map=new HashMap<>();
        long good=0;
        long total=(n*(n-1))/2;
        for(int i=0;i<nums.length;i++){
            int key=nums[i]-i;
            if(map.containsKey(key)){
                good+=map.get(key);
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1L);
            }
        }
        return total-good;
    }
}

