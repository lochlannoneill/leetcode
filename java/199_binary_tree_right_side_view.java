// ALL TESTS PASSED
// Time Complexity: O(n)
// Runtime: 0ms (better than 100.00%)
// Memory: 40.89MB (better than 86.88%)
// 
// Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
// 
// Example 1:
//      Input: root = [1,2,3,null,5,null,4]
//      Output: [1,3,4
// Example 2:
//      Input: root = [1,null,3]
//      Output: [1,3]
// Example 3:
//      Input: root = []
//      Output: []


class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        right(root, res, 0);
        return res;
    }


    public void right(TreeNode currTree, List<Integer> res, int currDepth) {
        if (currTree == null) return;
        if (currDepth == res.size()) res.add(currTree.val);

        right(currTree.right, res, currDepth + 1);
        right(currTree.left, res, currDepth + 1);
    }

}
