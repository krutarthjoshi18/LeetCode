package com.array.medium;

/**
 * Created by krutarthjoshi on 2/19/17.
 * Given a binary array, find the maximum number of consecutive 1s in this array if you can flip at most one 0.
 * Example 1:
 * Input: [1,0,1,1,0]
 * Output: 4
 * Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
 * After flipping, the maximum number of consecutive 1s is 4.
 * Note:
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 * Follow up:
 * What if the input numbers come in one by one as an infinite stream?
 * In other words, you can't store all numbers coming from the stream as it's too large to hold in memory.
 * Could you solve it efficiently?
 */
public class MaxConsecutiveOnesII {

    private int maxConsecutiveOnesII(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int lo = 0;
        int hi = lo;
        int l = nums.length;
        int maxLength = 1;
        for (int i = 0; i < l; i++) {
            hi++;
            if (nums[i] == 0) {
                lo = hi;
                hi = 0;
            }
            maxLength = Math.max(hi + lo, maxLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnesII mcoii = new MaxConsecutiveOnesII();
        int[] input = {0, 0, 0, 1, 1, 0, 1};
        System.out.println(mcoii.maxConsecutiveOnesII(input));
    }
}
