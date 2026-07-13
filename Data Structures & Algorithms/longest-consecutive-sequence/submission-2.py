class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        num_set=set()
        for num in nums:
            num_set.add(num)
        
        longest=0
        for num in num_set:
            if (num-1) not in num_set:
                current_num=num
                count=1
                while (current_num+1) in num_set:
                    count+=1
                    current_num+=1
                longest=max(count,longest)
        return longest
            