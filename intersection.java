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
