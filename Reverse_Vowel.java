// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

// Example 1:
// Input: s = "IceCreAm"
// Output: "AceCreIm"
// Explanation:
// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
class Solution {
    public String reverseVowels(String s) {
        char ch[]=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<=j){
            if(!Vowel(ch[i])){
                i++;
            }
            else if(!Vowel(ch[j])){
                j--;
            }
            else{
               char temp=ch[i];
               ch[i]=ch[j];
               ch[j]=temp;
               i++;
               j--;
            }
        }
        return String.valueOf(ch);
    }
    public static Boolean Vowel(char s){
        return s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' ||
               s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U';}
    
}
