class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> lcs= new HashSet<>();
        int l=0;
        int res=0;

        for(int r=0; r<s.length(); r++){
            while(lcs.contains(s.charAt(r))){
                lcs.remove(s.charAt(l));
                l++;

            }
            lcs.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
        }
}
