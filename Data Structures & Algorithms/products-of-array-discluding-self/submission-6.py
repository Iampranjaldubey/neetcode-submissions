class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        prod, count_zero = 1, 0

        for num in nums:
            if num:
                prod *= num
            else:
                count_zero += 1

        if count_zero > 1:
            return [0] * n

        result = [0] * n

        for i in range(n):
            if count_zero == 1:
                if nums[i] == 0:
                    result[i] = prod
                else:
                    result[i] = 0
            else:
                result[i] = prod // nums[i]

        return result