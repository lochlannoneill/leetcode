// ALL TESTS PASSED
// Time Complexity: O(n)
// Runtime: 1ms (beats 100.00%)
// Memory: 44.9MB (beats 66.55%)
// 
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
// Note that you must do this in-place without making a copy of the array.
//
// Example 1:
//      Input: nums = [0,1,0,3,12]
//      Output: [1,3,12,0,0]
// Example 2:
//      Input: nums = [0]
//      Output: [0]

package java;
class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != nonZeroIndex) { // Avoid unnecessary swaps
                    int temp = nums[i];
                    nums[i] = nums[nonZeroIndex];
                    nums[nonZeroIndex] = temp;
                }
                nonZeroIndex++;
            }
        }
    }
}