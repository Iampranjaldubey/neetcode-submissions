class Solution:
    def maxProduct(self, nums):
        curr_max = nums[0]
        curr_min = nums[0]
        answer = nums[0]

        for i in range(1, len(nums)):
            num = nums[i]

            # num can change max/min, so save old values
            old_max = curr_max
            old_min = curr_min

            curr_max = max(
                num,
                num * old_max,
                num * old_min
            )

            curr_min = min(
                num,
                num * old_max,
                num * old_min
            )

            answer = max(answer, curr_max)

        return answer