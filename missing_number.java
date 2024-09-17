class Solution {
    public int missingNumber(int[] nums) {
        //case 2
        //  Arrays.sort(nums);  
        //  for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != i) {
        //         return i;  
        //     }
        // }
        // return nums.length;
        
        
        //case 1
        int n=nums.length;
        int sn=0;
        int sum2=0;
        sn =n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum2+=nums[i];
        }
    return sn- sum2;
    }
}
