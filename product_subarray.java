class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int max = nums[0];
        int cmax = nums[0];
        int cmin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = cmax;
                cmax = cmin;
                cmin = temp;
            }
            cmax = Math.max(nums[i], cmax * nums[i]);
            cmin = Math.min(nums[i], cmin * nums[i]);           
            max= Math.max(maxp, cmax);
        }

        return max;
    }
}
