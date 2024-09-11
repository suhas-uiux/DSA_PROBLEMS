public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int first=-1;
        int miss=-1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(hm.containsKey(A[i])){
                first=A[i];
            }
            else{
                hm.put(A[i],1);
            } 
         
        }
        for(int i=1;i<A.length;i++){
            if(!hm.containsKey(i)){
                 miss=i;
                break;
            }
        }
        return new int[] {first,miss};
    }
}
