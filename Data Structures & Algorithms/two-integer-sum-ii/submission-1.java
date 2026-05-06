public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++) {
           
            int temp = target - numbers[i];
            
            if (mp.containsKey(temp)) {
                return new int[] { mp.get(temp), i + 1 };
            }
            mp.put(numbers[i], i + 1);
        
        }
        return new int[0];
    
    }
}