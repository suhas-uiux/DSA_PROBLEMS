class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
                if(max<arr[i]){
                    max=arr[i];
                }
            }
        
            Pair<Long,Long> s=new Pair<>((long) min,(long) max);
            return s;
        
    }
}
