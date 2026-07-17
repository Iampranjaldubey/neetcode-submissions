class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        # If s1 is longer than s2, no permutation is possible
        if len(s1) > len(s2):
            return False

        # Frequency arrays for 26 lowercase English letters
        s1_freq = [0] * 26
        s2_freq = [0] * 26

        # Build the frequency arrays for:
        # 1. Entire s1
        # 2. First window of s2 (same size as s1)
        for i in range(len(s1)):
            s1_freq[ord(s1[i]) - ord('a')] += 1
            s2_freq[ord(s2[i]) - ord('a')] += 1

        # If the first window itself is a permutation
        if s1_freq == s2_freq:
            return True

        # Sliding window
        left = 0

        # Expand the window one character at a time
        for right in range(len(s1), len(s2)):
            # Add the new character entering the window
            s2_freq[ord(s2[right]) - ord('a')] += 1

            # Remove the character leaving the window
            s2_freq[ord(s2[left]) - ord('a')] -= 1

            # Move the left pointer forward
            left += 1

            # Compare the frequency arrays
            if s1_freq == s2_freq:
                return True

        # No permutation found
        return False