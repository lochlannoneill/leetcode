// ALL TESTS PASSED
// Time Complexity: O(n)
// Runtime: 10ms (beats 41.31%)
// Memory: 44.27MB (beats 21.89%)
// 
// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.
//
// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
//
// Example 1:
//      Input: s = "the sky is blue"
//      Output: "blue is sky the"
// Example 2:
//      Input: s = "  hello world  "
//      Output: "world hello"
// Example 3:
//      Input: s = "a good   example"
//      Output: "example good a"

class Solution {
    public String reverseWords(String s) {
        String res = "";
        List<String> words = Arrays.asList(s.split("\\s+"));

        for (int i = words.size() - 1; i >= 0; i--) {
            res += words.get(i);
            if (i > 0) {
                res += " ";
            }
        }

        return res.trim();
    }
}