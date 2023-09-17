// ALL TESTS PASSED
// Time Complexity: O(1) -> O(n)
// Runtime: 1ms (better than 98.00%)
// Memory: 43.18MB (better than 99.50%)
// 
// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
// 
// Example 1:
//      Input: flowerbed = [1,0,0,0,1], n = 1
//      Output: true
// Example 2:
//      Input: flowerbed = [1,0,0,0,1], n = 2
//      Output: false

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int counter = 0;

        if (flowerbed.length == 0) return false;
        if (n == 0) return true;

        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                int left = (i == 0) ? 0 : flowerbed[i-1];
                int right = (i == flowerbed.length - 1) ? 0 : flowerbed[i+1];

                if ((left == 0) && (right == 0)) {
                    flowerbed[i] = 1;
                    counter++;
                }
            }
        }

        return n <= counter;
    }
}