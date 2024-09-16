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
