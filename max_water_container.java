class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int width=0;
        int h=0;
        int ar=0;
        int maxar=0;
        while(i<j){
            width=j-i;
            h=Math.min(height[i],height[j]);
            ar=width*h;
            maxar=Math.max(maxar,ar);
            if(height[i]<height[j])
            {
                i++;
            }
            else{
                j--;
            }
        }
        return maxar;
        
    }
}
