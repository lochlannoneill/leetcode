// ALL TESTS PASSED
// Runtime: 0ms (better than 100.00%)
// Memory: 41.43MB (better than 54.37%)
// 
// Given the root of a binary tree, return its maximum depth.
// A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
// 
// Example 1:
//      Input: root = [3,9,20,null,null,15,7]
//      Output: 3
// Example 2:
//      Input: root = [1,null,2]
//      Output: 2

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int maxLeft = maxDepth(root.left);
        int maxRight = maxDepth(root.right);

        return Math.max(maxLeft, maxRight) + 1;
    }
}