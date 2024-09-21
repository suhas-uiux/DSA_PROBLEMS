
class Solution {
    public String largestNumber(int[] nums) {
       
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        int max = 0;
        int temp = 0;
        
       
        while (j < nums.length) {
            
            String num1 = String.valueOf(nums[max]) + String.valueOf(nums[j]);
            String num2 = String.valueOf(nums[j]) + String.valueOf(nums[max]);            
            
            
            if (num2.compareTo(num1) > 0) {
                max = j;
            }
            
            
            if (j == nums.length - 1) {
                temp = nums[i];
                nums[i] = nums[max];
                nums[max] = temp;
                i++;
                j = i;
                max = i; 
            }
            
            j++;
        }
        
       
        if (nums[0] == 0) {
            return "0";
        }
        
        
        StringBuilder result = new StringBuilder();
        for (int m : nums) {
            result.append(m);
        }
        
        return result.toString();
    }

   
}
