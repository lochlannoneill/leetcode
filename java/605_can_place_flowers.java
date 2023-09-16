// ALL TESTS PASSED
// Runtime: 1ms (faster than 98.00%)
// Memory: 43.18MB (faster than 99.50%)
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

        // empty flowerbed
        if (flowerbed.length == 0) return false;

        // plant nothing
        if (n == 0) return true;

        // // plant when flowerpot size of 1
        // if (flowerbed.length == 1) {
        //     return flowerbed[0] == 0 || n == 0;
        // }

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