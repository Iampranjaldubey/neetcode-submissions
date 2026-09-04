class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        n = len(nums)
        freq={}

        for num in nums:
            freq[num]=freq.get(num,0)+1
        
        sortedKey=sorted(freq, key=freq.get, reverse=True)

        return sortedKey[:k]