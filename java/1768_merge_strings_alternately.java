// ALL TESTS PASSED
// Runtime: 7ms (better than 26.35%)
// Memory: 42.14MB (better than 5.40%)
// 
//  You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
// 
// Input: word1 = "abcd", word2 = "pq"
// Output: "apbqcd"
// Explanation: Notice that as word1 is longer, "cd" is appended to the end.
// word1:  a   b   c   d
// word2:    p   q 
// merged: a p b q c   d

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        String longest = (word1.length() > word2.length()) ? word1 : word2;

        for (int i = 0; i < longest.length(); i++) {
          if (i < word1.length()) {
            res += word1.charAt(i);
          }
          if (i < word2.length()) {
            res += word2.charAt(i);
          }
        }

        return res;
    }
}
