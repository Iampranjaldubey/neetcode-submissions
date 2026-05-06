class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int goal = target-nums[i];
            if (map.containsKey(goal)){
                int[] arr= new int[2];
                arr[0]= map.get(goal);
                arr[1]= i;
                return arr;
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
        
        
    }
}
