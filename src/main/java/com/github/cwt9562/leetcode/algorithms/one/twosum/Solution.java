package com.github.cwt9562.leetcode.algorithms.one.twosum;

/**
 * Created by Thomas Chen on 2015/6/30.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Integer length = nums.length;
        Integer indexI = 0;
        Integer indexJ = 0;
        boolean finish = false;
        for (int i = 0; i < length - 1 && !finish; i++) {
            for (int j = i + 1; j < length && !finish; j++) {
                if (nums[i] + nums[j] == target) {
                    indexI = i;
                    indexJ = j;
                    finish = true;
                }
            }
        }
        return new int[]{indexI + 1, indexJ + 1};
    }
}
