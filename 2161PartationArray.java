// You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:

// Every element less than pivot appears before every element greater than pivot.
// Every element equal to pivot appears in between the elements less than and greater than pivot.
// The relative order of the elements less than pivot and the elements greater than pivot is maintained.
// More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position of the jth element. For elements less than pivot, if i < j and nums[i] < pivot and nums[j] < pivot, then pi < pj. Similarly for elements greater than pivot, if i < j and nums[i] > pivot and nums[j] > pivot, then pi < pj.
// Return nums after the rearrangement.

 

// Example 1:

// Input: nums = [9,12,5,10,14,3,10], pivot = 10
// Output: [9,5,3,10,10,12,14]
// Explanation: 
// The elements 9, 5, and 3 are less than the pivot so they are on the left side of the array.
// The elements 12 and 14 are greater than the pivot so they are on the right side of the array.
// The relative ordering of the elements less than and greater than pivot is also maintained. [9, 5, 3] and [12, 14] are the respective orderings.
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int less=0;
        int equal=0;
        int greater=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr[less]=nums[i];
                less++;
            }
        }
        equal=less;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==pivot){
                arr[equal]=nums[j];
                equal++;
            }
        }
        greater=equal;
        for(int k=0;k<nums.length;k++){
            if(nums[k]>pivot){
                arr[greater]=nums[k];
                greater++;
            }
        }
        return arr;
    }
}
