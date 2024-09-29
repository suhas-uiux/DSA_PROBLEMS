class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr=new int[nums.length];
        k=k%nums.length;
       for(int i=0;i<k;i++){
            arr[i]=nums[nums.length-k+i];
       }
       for(int i=k;i<nums.length;i++){
            arr[i]=nums[i-k];
       }
            System.arraycopy(arr, 0, nums, 0, nums.length);
    }
}
