// You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:

// The 2D array should contain only the elements of the array nums.
// Each row in the 2D array contains distinct integers.
// The number of rows in the 2D array should be minimal.
// Return the resulting array. If there are multiple answers, return any of them.

// Note that the 2D array can have a different number of elements on each row.

 

// Example 1:

// Input: nums = [1,3,4,1,2,3,1]
// Output: [[1,3,4,2],[1,3],[1]]
// Explanation: We can create a 2D array that contains the following rows:
// - 1,3,4,2
// - 1,3
// - 1
// All elements of nums were used, and each row of the 2D array contains distinct integers, so it is a valid answer.
// It can be shown that we cannot have less than 3 rows in a valid array.


class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result=new ArrayList();
        int freq[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]>=result.size()){
            result.add(new ArrayList<>());
            }
            result.get(freq[nums[i]]).add(nums[i]);
            freq[nums[i]]++;
        }
        return result;
    }
}
