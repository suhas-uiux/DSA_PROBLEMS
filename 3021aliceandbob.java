class Solution {
    public long flowerGame(int n, int m) {
        long nodd=(n+1)/2;
        long neven=n/2;
        long modd=(m+1)/2;
        long meven=m/2;
        return nodd*meven+modd*neven;
    }
}
