// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].
// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].
// Example 3:

// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].

class Solution {
    public int[] plusOne(int[] digits) {
        int[] arr=new int[digits.length];
        for(int i=0;i<digits.length;i++){
                arr[i]=digits[i];
        }
        arr[digits.length-1]=1+digits[digits.length-1];
         for (int i = digits.length - 1; i > 0; i--) {
            if (arr[i] > 9) {
                arr[i] = 0;         
                arr[i - 1] += 1;   
            }
        }
        if (arr[0] > 9) {
            int[] newArr = new int[digits.length + 1];  
            newArr[0] = 1;  
            return newArr;
        }
        return arr;
    }
}
