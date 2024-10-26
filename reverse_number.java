// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321

class Solution {
    public int reverse(int x) {
        int reversed = 0;
        
        while (x != 0) {
            int digit = x % 10;  
                       
            
           
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                return 0;  
            }
            
            reversed = reversed * 10 + digit;
             x /= 10; 
        }
        
        return reversed;
    }
}
