
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);

        long mindiff = Long.MAX_VALUE;

        for (int i = 0; i <= n - m; i++) {
            
            long diff = a.get(i + m - 1) - a.get(i);
            
            if (diff < mindiff) {
                mindiff = diff;
            }
        }
        return minDiff;
        
        
        // your code here
    }
}
