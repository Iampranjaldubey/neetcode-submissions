class Solution {
    public int longestConsecutive(int[] nums) {
        // remove the duplicates from the nums
        HashSet<Integer> numset=new HashSet<>();

        for (int num : nums){
            numset.add(num);
        }
        int longest=0;
        for (int num : numset){
            if (! numset.contains(num-1)){
                int currentnum=num;
                int count=1;
                while (numset.contains(currentnum + 1)){
                    count++;
                    currentnum++;
                }
                longest = Math.max(longest,count);         
            }
        }
        return longest;
        
    }
}
