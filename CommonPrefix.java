// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".
// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int i=0;
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
            }
            else{
                break;
            }
        }
        if(i==0){
            return "";
        }
        else{
            return s1.substring(0,i);
        }
    }
}
