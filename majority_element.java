

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int majorityElement = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else{
                count = 1;
                }
            if (count > n / 2) {
                majorityElement = nums[i];
                break; 
            }
        }
        
        return majorityElement;
    }
}
