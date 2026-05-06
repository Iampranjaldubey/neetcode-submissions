class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;

        for(int x:piles){
            high = Math.max(x,high);
        }
        int result = high;
        while(low<=high){
            int k = low + (high-low)/2;
            int time = 0;
            for (int p : piles){
                time += (p + k -1)/k;
            }
            if(time <= h){
                result = k;
                high = k-1;
            }
            else{
                low = k+1;
            }
        }
        return result;
        
    }
}
