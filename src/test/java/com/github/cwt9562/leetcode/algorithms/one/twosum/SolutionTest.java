package com.github.cwt9562.leetcode.algorithms.one.twosum;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Thomas Chen on 2015/6/30.
 */
public class SolutionTest {

    @Test
    public void testTwoSum() throws Exception {
        test(new int[]{2, 2}, 4, new int[]{1, 2});
        test(new int[]{0, 2, 3, 4}, 4, new int[]{1, 4});
        test(new int[]{9, 5, 8, 4}, 17, new int[]{1, 3});
    }

    private void test(int[] nums, int target, int[] expect) {
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        Assert.assertArrayEquals(result, expect);
    }
}