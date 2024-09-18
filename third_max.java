class Solution {
    public int thirdMax(int[] nums) {
      int count=1;

    int n=nums[nums.length-1];
      Arrays.sort(nums);
      for(int i=nums.length-2;i>=0;i--)
      {
        
        if(nums[i]!=nums[i+1]){
          count++;
           n=nums[i];
           
        }
        if(count==3){

      return n;
        }
    }
    return nums[nums.length-1];
}
}
