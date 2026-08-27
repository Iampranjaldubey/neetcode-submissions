class Solution:
    def longestPalindrome(self, s: str) -> str:
        n = len(s)

        dp = [[False] * n for _ in range(n)]

        start = 0
        max_length = 1

        # Every single character is a palindrome
        for i in range(n):
            dp[i][i] = True

        # Check substrings by length
        for length in range(2, n + 1):

            for i in range(n - length + 1):
                j = i + length - 1

                if s[i] == s[j]:

                    # Length 2 or 3 has automatically
                    # a palindrome inside
                    if length <= 3:
                        dp[i][j] = True
                    else:
                        dp[i][j] = dp[i + 1][j - 1]

                if dp[i][j] and length > max_length:
                    start = i
                    max_length = length

        return s[start:start + max_length]