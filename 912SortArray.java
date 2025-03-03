// Given an array of integers nums, sort the array in ascending order and return it.
// You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.
// Example 1:
// Input: nums = [5,2,3,1]
// Output: [1,2,3,5]
// Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).

//                                                                OR
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.

// Example 1:
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:
// Input: nums = [2,0,1]
// Output: [0,1,2]
class Solution {
    public int[] sortArray(int[] nums) {
     Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
    int min=nums[0];
    int max=nums[0];
     for(int i=0;i<nums.length;i++){
        if(hm.containsKey(nums[i])){
            hm.put(nums[i],hm.get(nums[i])+1);
        }
        else{
            hm.put(nums[i],1);
        }
        if(min>nums[i]){
                min=nums[i];
        }
        if(max<nums[i]){
            max=nums[i];
        }
     }
     int index=0;
    for(int i=min;i<=max;i++){
        while(hm.getOrDefault(i,0)>0){
            nums[index]=i;
            index++;
            hm.put(i,hm.get(i)-1);
        }
    }
    return nums;
    }
}
