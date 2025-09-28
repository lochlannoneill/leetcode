# [242. Valid Anagram
# Solved
# Easy

# Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

# Example 1:

# Input: s = "anagram", t = "nagaram"

# Output: true

# Example 2:

# Input: s = "rat", t = "car"

# Output: false

 

# Constraints:

# 1 <= s.length, t.length <= 5 * 104
# s and t consist of lowercase English letters.
 

# Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False

        s_dict = {}
        t_dict = {}

        for letter in s:
            s_dict[letter] = s_dict.get(letter, 0) + 1
        
        for letter in t:
            t_dict[letter] = t_dict.get(letter, 0) + 1
        
        return s_dict == t_dict