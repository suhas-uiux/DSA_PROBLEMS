// Given an array of strings strs, group the 
// anagrams
//  together. You can return the answer in any order.
// Example 1:
// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// Explanation:
// There is no string in strs that can be rearranged to form "bat".
// The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
// The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> al=new ArrayList<>();
        Map<String,List<String>> hm=new HashMap<String,List<String>>();
        for(String str:strs){
            char letter[]=str.toCharArray();
            Arrays.sort(letter);
            String Sort=new String(letter);
            if(hm.containsKey(Sort)==false){
                hm.put(Sort,new ArrayList<>());   
            }
            hm.get(Sort).add(str);
        }
        al.addAll(hm.values());
        return al;
    }
}
