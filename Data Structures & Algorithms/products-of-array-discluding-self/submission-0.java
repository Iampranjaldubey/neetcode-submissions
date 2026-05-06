class Solution {
    public int[] productExceptSelf(int[] nums) {
        // ArrayList<Interger> result = new ArrayList<>();
        int[] result = new int[nums.length];

        int count = 0;
        int prod = 1;
        for (int num : nums){
            if(num==0){
                count++;
            }
            else{
                prod*=num;
            }
        }
        if(count>=2){
            return result;
        }
        else{
            if (count==1){
                for (int i=0 ; i<nums.length; i++){
                    int val = nums[i];
                    if(val==0){
                        result[i]=prod;
                    }

                }

            }
            else{
                for(int i=0 ; i<nums.length; i++){
                    result[i] = prod/nums[i];

                }
            }
        }
        return result;
        
    }
}  
