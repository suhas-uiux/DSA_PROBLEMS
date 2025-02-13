class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int count = 0; 
        int currentEnd = 0; 

        if (nums.length == 1) {
            return 0; 
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (i > jump) {
                return 0;
            }

            jump = Math.max(jump, i + nums[i]);

            if (i == currentEnd) { 
                count++;
                currentEnd = jump;

                if (currentEnd >= nums.length - 1) {
                    return count;
                }
            }
        }

        return count;
    }
}
