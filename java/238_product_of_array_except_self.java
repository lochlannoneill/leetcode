// WRONG ANSWER
// 7/22 Test Cases Passed
// Time Complexity: O(n)
// Runtime: N/A
// Memory: N/A
// 
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// You must write an algorithm that runs in O(n) time and without using the division operation.
//
// Example 1:
//      Input: nums = [1,2,3,4]
//      Output: [24,12,8,6]
// Example 2:
//      Input: nums = [-1,1,0,-3,3]
//      Output: [0,0,9,0,0]

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length - 1; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
            if (i != j) { // Exclude the current element from the product
                    product *= nums[j];
                }
            }
            res[i] = product;
        }

        return res;
    }
}