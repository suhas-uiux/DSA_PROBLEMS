import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int m=num1.length();
        int n=num2.length();
        int[] res=new int[m+n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum=mul+res[i+j+1];
                res[i+j+1]=sum%10;
                res[i+j]+=sum/10;
            }
        }
        StringBuilder str=new StringBuilder();
        for (int num : res) {
            if (!(str.length() == 0 && num == 0)) {  
                str.append(num);
            }
        }

        return str.toString();
    }
}
