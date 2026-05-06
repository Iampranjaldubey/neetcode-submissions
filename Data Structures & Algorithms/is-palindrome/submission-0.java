class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int low=0;
        int high= clean.length()-1;
        
        while(low<high){
            if (clean.charAt(low)!=clean.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
