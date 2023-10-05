// ALL TESTS PASSED
// Time Complexity: O(n)
// Runtime: 1ms (better than 100.00%)
// Memory: 44.9MB (better than 66.55%)
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

class Solution {
    public void moveZeroes(int[] nums) {
        int index_nozero = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[index_nozero] = num;
                index_nozero++;
            }
        }

        for (int i = index_nozero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}