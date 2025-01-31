import java.util.*;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        List<List<Character>> wordCharLists = new ArrayList<>();
        // Convert wordDict into a list of character lists
        for (String word : wordDict) {
            List<Character> charList = new ArrayList<>();
            for (char c : word.toCharArray()) {
                charList.add(c);
            }
            wordCharLists.add(charList);
        }
        int i = 0;  
        while (i < s.length()) {
            boolean foundMatch = false;
            for (List<Character> wordChars : wordCharLists) {
                int j = 0;  // Pointer to traverse the current word
                boolean isMatch = true;
                // Check if characters in s match with the current word in wordDict
                while (j < wordChars.size() && i + j < s.length()) {
                    if (s.charAt(i + j) != wordChars.get(j)) {
                        isMatch = false;
                        break;
                    }
                    j++;
                }
                // If the word matches and we're at the end of the word, move the pointer in 's'
                if (isMatch && j == wordChars.size()) {
                    i += j;  // Move the pointer by the length of the matched word
                    foundMatch = true;
                    break;
                }
            }
            // If no match was found for the current position in 's', return false
            if (!foundMatch) {
                return false;
            }
        }
        // If we successfully traverse the whole string
        return true;
    }
}
