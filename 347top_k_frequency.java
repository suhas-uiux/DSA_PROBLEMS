// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
//   Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
// Example 2:

// Input: nums = [1], k = 1
// Output: [1]
 
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer>[] count = new ArrayList[nums.length + 1];
        int[] ans  = new int[k];
        for(int i = 0; i < count.length; i++){
            count[i] = new ArrayList<>();
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        for(int ele: map.keySet()){
            count[map.get(ele)].add(ele);
        }
        int f = 0;
        for(int i = count.length - 1; i >= 0; i--){
           if(k == 0) break;
            ArrayList<Integer> a = count[i];
            for(int j = 0; j < a.size(); j++){
                if(k == 0) break;
                ans[f++] = a.get(j);
                k--;
            }
        }
        return ans;
    }
}
