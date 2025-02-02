class Solution {
    public int myAtoi(String s) {
        s = s.trim(); 
        if (s.isEmpty()) return 0;
        
        int sign = 1, i = 0, n = s.length();
long result = 0;

        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') {
                sign = -1;
            }else{
                sign=1;
            }
            i++; 
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            if(result*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(result*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)(result*sign);
    }
}
