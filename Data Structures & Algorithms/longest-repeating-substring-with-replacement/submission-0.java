public class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            // increase frequency
            map.put(current, map.getOrDefault(current, 0) + 1);

            // update maximum frequency in window
            maxFreq = Math.max(maxFreq, map.get(current));

            // if more than k replacements needed, shrink window
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            // update result
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
