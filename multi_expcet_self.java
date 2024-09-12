class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] max1=new int[nums.length];
        int[] max2=new int[nums.length];
        
        max1[0] = 1;
        max2[nums.length - 1] = 1;
        
        
        for (int i = 1; i < nums.length; i++) {
            max1[i] = max1[i - 1] * nums[i - 1];
        }
        
       
        for (int i = nums.length - 2; i >= 0; i--) {
            max2[i] = max2[i + 1] * nums[i + 1];
        }
        
        for(int i=0;i<nums.length;i++){
            max1[i]=max1[i]*max2[i];
        }        
        return max1;
    }
}
