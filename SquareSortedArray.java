class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=(int)Math.pow(nums,2);
        }
        Arrays.sort(ans);
        return ans;
    }
}
