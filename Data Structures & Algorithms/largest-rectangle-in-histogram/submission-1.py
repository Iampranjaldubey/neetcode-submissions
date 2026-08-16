class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        stack = []
        maxArea = 0

        for i, h in enumerate(heights):

            while stack and heights[stack[-1]] > h:
                height = heights[stack.pop()]

                left = stack[-1] if stack else -1

                width = i - left - 1

                maxArea = max(maxArea, height * width)

            stack.append(i)

        n = len(heights)

        while stack:
            height = heights[stack.pop()]

            left = stack[-1] if stack else -1

            width = n - left - 1

            maxArea = max(maxArea, height * width)

        return maxArea