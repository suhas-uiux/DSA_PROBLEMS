// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
// Each letter in pattern maps to exactly one unique word in s.
// Each unique word in s maps to exactly one letter in pattern.
// No two letters map to the same word, and no two words map to the same letter.
 

// Example 1:
// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true
class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] str=pattern.toCharArray();
        String[] str2=s.split(" ");

        if (str.length != str2.length) {
            return false;  }
        Map<Character,String> hm=new HashMap<Character,String>();
        for(int i=0;i<str.length;i++){
            if(hm.containsKey(str[i])){
                if (!hm.get(str[i]).equals(str2[i])) {
                    return false;
                }
            }
           else{
            if (hm.containsValue(str2[i])) {
                    return false;
                }
                hm.put(str[i], str2[i]);
           }
        }
        return true;
    }
}
