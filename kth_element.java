// Example 1:

// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5
// Example 2:

// Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
// Output: 4

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
    return nums[nums.length-k];
}
}
