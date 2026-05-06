// class Solution {
//     public int trap(int[] height) {
//         int n= height.length;
//         int [] left = new int[n];
//         left[0] = height[0];
//         int [] right= new int[n];
//         right[n-1] =height[n-1];
//         // this loop for the left
//         for(int i=1; i<n-1 ; i++){
//             left[i] = Math.max(left[i-1],height[i]);

//         }
//         // this loop for the right
//         for(int j=n-2; j>=0;j--){
//             right[j]=Math.max(right[j+1],height[j]);

//         }
//         int maxWater=0;
//         for(int i=0; i<n; i++){
//             int current=Math.min(left[i],right[i])-height[i];
//             if (current>0){
//                 maxWater=+current;
//             }

//         }
//         return maxWater;
        
//     }
// }
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] left = new int[n];
        int[] right = new int[n];

        // left max array
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        // right max array
        right[n - 1] = height[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            right[j] = Math.max(right[j + 1], height[j]);
        }

        int maxWater = 0;
        for (int i = 0; i < n; i++) {
            int current = Math.min(left[i], right[i]) - height[i];
            if (current > 0) {
                maxWater += current;
            }
        }

        return maxWater;
    }
}
