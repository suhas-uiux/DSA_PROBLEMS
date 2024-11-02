import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],i);
            }
            else{
               int pi= hm.get(nums[i]);
               if(Math.abs(pi-i)<=k){
                return true;
               }
               else{
                   hm.put(nums[i],i);
               }
            }
        }
        return false;
    }
}
