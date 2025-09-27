// 3. Longest Substring Without Repeating Characters
// Solved
// Medium

// Given a string s, find the length of the longest substring without duplicate characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

// Constraints:

// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        HashSet<Character> substring = new HashSet<>();

        while (right < s.length()) {
            // right pointer + 1
            if (!substring.contains(s.charAt(right))) {
                substring.add(s.charAt(right));
                right++;
                max = Math.max(max, substring.size());  // compare max at each iteration
            }
            // left pointer + 1
            else {
                substring.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}