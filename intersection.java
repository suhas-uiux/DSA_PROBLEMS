// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> hs=new HashSet<>();
        int n1=nums1.length;
        int n2=nums2.length;
       // int[] arr=new int[100];
        int i=0;
        int j=0;

        while(i<n1&& j<n2){
            
            if(nums1[i]==nums2[j]){
                hs.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
            
        }
        int[] result = new int[hs.size()];
        int k = 0;
        for (int num : hs) {
            result[k++] = num;
        }
        
        return result;
        
        
    }
}
