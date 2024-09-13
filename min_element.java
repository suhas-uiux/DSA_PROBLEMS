class Solution {
    public int findMin(int[] nums) {
        int min=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[min]){
                    min=i;
            }
        }
        return nums[min];
        
    }
}
