# 42. Trapping Rain Water
# Solved
# Hard

# Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

# Example 1:


# Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
# Output: 6
# Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
# Example 2:

# Input: height = [4,2,0,3,2,5]
# Output: 9
 

# Constraints:

# n == height.length
# 1 <= n <= 2 * 104
# 0 <= height[i] <= 105

class Solution(object):
    def trap(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left = 0
        right = len(height) - 1

        left_max = height[left]
        right_max = height[right]
        area = 0

        while left < right:
            # Get water on left -> tallest left bar - current bar == water
            if height[left] < height[right]:
                left += 1
                left_max = max(left_max, height[left])
                area += left_max - height[left]
                
            #Get water on right -> tallest right bar - current bar == water
            else:
                right -= 1
                right_max = max(right_max, height[right])
                area += right_max - height[right]
        
        return area