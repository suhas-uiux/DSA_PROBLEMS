// Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
// Return the largest lucky integer in the array. If there is no lucky integer return -1.

// Example 1:
// Input: arr = [2,2,3,4]
// Output: 2
// Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
class Solution {
    public int findLucky(int[] arr) {
        int x=0;
        Map<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
       for (int i : arr) {
            if (hashmap.containsKey(i)) {
                hashmap.put(i, hashmap.get(i) + 1);
            } else {
                hashmap.put(i, 1);
            }
        }
         for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
        if(entry.getKey().equals(entry.getValue())){
              x=entry.getKey();
            }
        }
        if(x!=0){
            return x;
        }
        else{
            return -1;
        }
    }}
