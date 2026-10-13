/*34. Find First and Last Position of Element in Sorted Array*/
/** Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 *
 * If target is not found in the array, return [-1, -1].
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 */
package leetcode.arrays;

import java.util.Arrays;

public class FirstLastPosition_34 {

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1}; // Default answer if target is not found

        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);

        return result;

    }

    private int findFirst(int[] nums, int target) {
        int lowerBound = 0;
        int upperBound = nums.length - 1;

        int firstPosition = -1;

        while (lowerBound <= upperBound) {
            int mid = (lowerBound + upperBound) / 2;
            if (nums[mid] == target) {
                firstPosition = mid;
                upperBound = mid - 1;
            } else if (nums[mid] < target) {
                lowerBound = mid + 1;
            } else {
                upperBound = mid - 1;
            }
        }
        return firstPosition;
    }

    private int findLast(int[] nums, int target) {
        int lowerBound = 0;
        int upperBound = nums.length - 1;

        int lastPosition = -1;

        while (lowerBound <= upperBound) {
            int mid = (lowerBound + upperBound) / 2;
            if (nums[mid] == target) {
                lastPosition = mid;
                lowerBound = mid + 1;
            } else if (nums[mid] > target) {
                upperBound = mid - 1;
            } else {
                lowerBound = mid + 1;
            }
        }
        return lastPosition;

    }

    public static void main(String[] args) {
        FirstLastPosition_34 solution = new FirstLastPosition_34();

        int[] nums = {5, 7, 7, 8, 8, 10};

        int[] result1 = solution.searchRange(nums, 8);
        System.out.println("Target 8 range : " + Arrays.toString(result1));

        int[] result2 = solution.searchRange(nums, 6);
        System.out.println("Target 6 range : " + Arrays.toString(result2));

        int[] result3 = solution.searchRange(nums, 0);
        System.out.println("Target 0 range : " + Arrays.toString(result3));
    }

}
