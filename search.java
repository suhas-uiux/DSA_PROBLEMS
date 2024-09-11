class Solution {
    public int search(int[] nums, int target) {
        int num=-1;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                num=i;
            }
        }   
        if(num==-1){
        return -1;
        }  
        else{
            return num;
        }
    }
}
