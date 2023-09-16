// ALL TESTS PASSED
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
