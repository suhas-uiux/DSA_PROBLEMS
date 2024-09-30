// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
class Solution {
    public int maxSubArray(int[] nums) {
     int sum=0;
     int max=nums[0];
     for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
        if(sum<0){
            sum=0;
        }
        if(sum>max){
            max=sum;
        }
     }  
     return max;
    }
}
