class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int [] merged=new int[m+n];
        int i = 0,j = 0,k = 0;

        while (i<m && j<n){
            if (nums1[i]<nums2[j]){
                merged[k]=nums1[i];
                i++;
                k++;
            }
            else{
                merged[k]=nums2[j];
                j++;
                k++;
            }

        }
        while(i<m){
            merged[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            merged[k]=nums2[j];
            j++;
            k++; 
        }
        if((m+n)%2==0){
            int mid = (m+n)/2;
            return ((merged[mid]+merged[mid-1]))/2.0;
        }
        else{
            return merged[(m+n)/2];
        }

        
    }
}
