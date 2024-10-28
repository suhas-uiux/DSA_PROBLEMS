// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
      for(int i=0;i<nums.length;i++){
        int req_num=target-nums[i];
        if(hm.containsKey(req_num)){
            int[] arr={hm.get(req_num),i};
            return arr;
        }
        hm.put(nums[i],i);
      }
      return null;
    }
}
