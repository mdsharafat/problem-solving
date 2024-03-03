package com.company.problemsolving.leetcode;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 03 Mar, 2024 at 1:53 PM
 ******************************************
 */
public class LC1TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;
        int[] result = twoSum(nums, target);

        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1) return nums;
        int[] result = new int[2];
        int firstPointer = 0;
        int lastPointer = 1;

        while (nums[firstPointer] + nums[lastPointer] != target) {
            if (lastPointer == nums.length - 1) {
                firstPointer++;
                lastPointer = firstPointer + 1;
            }else {
                lastPointer++;
            }
        }
        result[0] = firstPointer;
        result[1] = lastPointer;
        return result;
    }
}
