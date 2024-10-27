// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
class Solution {
    public int[] searchRange(int[] nums, int val) {
        int[] res = new int[2];
        res[0] = findLeftmost(nums, val);
        res[1] = findRightmost(nums, val);
        return res;
    }
    
    private int findLeftmost(int[] nums, int val) {
        int left = 0, right = nums.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == val) {
                index = mid;
                right = mid - 1; // continue searching in the left half
            } else if (nums[mid] < val) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
    
    private int findRightmost(int[] nums, int val) {
        int left = 0, right = nums.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == val) {
                index = mid;
                left = mid + 1; // continue searching in the right half
            } else if (nums[mid] < val) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}
