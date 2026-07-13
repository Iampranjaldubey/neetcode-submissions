class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        Array = [0] * 26
        for i in range(len(s)):
            Array[ord(s[i]) - ord('a')] += 1
            Array[ord(t[i]) - ord('a')] -= 1

        for val in Array:
            if val != 0:
                return False
        return True