// Input: num = 38
// Output: 2
// Explanation: The process is
// 38 --> 3 + 8 --> 11
// 11 --> 1 + 1 --> 2 
// Since 2 has only one digit, return it.
class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        else{
            return 1+(num-1)%9;
        }
    }
}
