# 3. Longest Substring Without Repeating Characters
# Solved
# Medium

# Given a string s, find the length of the longest substring without duplicate characters.

 

# Example 1:

# Input: s = "abcabcbb"
# Output: 3
# Explanation: The answer is "abc", with the length of 3.
# Example 2:

# Input: s = "bbbbb"
# Output: 1
# Explanation: The answer is "b", with the length of 1.
# Example 3:

# Input: s = "pwwkew"
# Output: 3
# Explanation: The answer is "wke", with the length of 3.
# Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

# Constraints:

# 0 <= s.length <= 5 * 104
# s consists of English letters, digits, symbols and spaces.

class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        left = 0
        right = 0

        substring = list()
        max_substring = 0

        while right < len(s):
            if s[right] not in substring:
                substring.append(s[right])
                max_substring = max(max_substring, len(substring))
                right += 1
            else:
                substring.remove(s[left])
                left += 1
        
        return max_substring