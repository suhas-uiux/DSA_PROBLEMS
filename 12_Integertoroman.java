class Solution {
    public String intToRoman(int num) {
        String rm="";
        int[] arr={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] str={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
          for (int i = arr.length - 1; i >= 0; i--) {
            while (num >= arr[i]) {
                rm += str[i];
                num -= arr[i];
            }
        }
        return rm;
    }
}

