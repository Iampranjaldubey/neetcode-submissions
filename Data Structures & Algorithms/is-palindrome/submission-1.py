import re 
class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean = re.sub(r'[^a-zA-Z0-9]', '', s).lower()
        low=0
        high=len(clean)-1

        while low<high:
            if clean[low]!= clean[high]:
                return False
            low+=1
            high-=1
        return True