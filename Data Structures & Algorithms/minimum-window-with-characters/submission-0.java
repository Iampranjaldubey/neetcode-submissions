class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        //Storing frequency of characters in t
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int count = 0;  // count of matched characters
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Add current character to window
            if (need.containsKey(ch)) {
                window.put(ch, window.getOrDefault(ch, 0) + 1);

                // If frequency matches, increase count
                if (window.get(ch) <= need.get(ch)) {
                    count++;
                }
            }

            // When all characters of t are matched
            while (count == t.length()) {

                // Update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if (need.containsKey(leftChar)) {
                    window.put(leftChar, window.get(leftChar) - 1);

                    if (window.get(leftChar) < need.get(leftChar)) {
                        count--;
                    }
                }

                left++;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(start, start + minLen);
        }

    }
}
