// Given a string s, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.

// Return the minimum number of substrings in such a partition.

// Note that each character should belong to exactly one substring in a partition.

 

// Example 1:

// Input: s = "abacaba"
// Output: 4
// Explanation:
// Two possible partitions are ("a","ba","cab","a") and ("ab","a","ca","ba").
// It can be shown that 4 is the minimum number of substrings needed.
class Solution {
    public int partitionString(String s) {
        int result=1;
        HashSet<Character> u=new HashSet<>();
        for(char ch : s.toCharArray()){
            if(u.contains(ch)){
                result++;
                u.clear();
            }
            u.add(ch);
        }
        return result;
    }
}
