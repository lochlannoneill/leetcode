/*
Accepted
63 / 63 testcases passed
lochlannoneill
lochlannoneill
submitted at Jan 05, 2025 18:23

Runtime
2
ms
Beats
98.94%
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return new int[] {};
    }
}