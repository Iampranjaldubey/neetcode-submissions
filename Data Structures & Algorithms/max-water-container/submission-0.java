class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int max_water=0;

        for(int i=0;i<n;i++){
            int current=0;
            for(int j=i+1;j<n;j++){
                current=(j-i)*Math.min(heights[j],heights[i]);
                max_water=Math.max(max_water,current);
            }
        }
        return max_water;
    }
}
