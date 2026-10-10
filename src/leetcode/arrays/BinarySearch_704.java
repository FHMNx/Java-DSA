// 704. Binary Search
// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
// You must write an algorithm with O(log n) runtime complexity.
package leetcode.arrays;

import java.util.Scanner;

public class BinarySearch_704 {

    public int search(int[] nums, int target) {
        int lowerBound = 0;
        int upperBound = nums.length;

        while (lowerBound <= upperBound) {
            int mid = (lowerBound + upperBound) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                lowerBound = mid + 1;
            } else {
                upperBound = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch_704 solution = new BinarySearch_704();

        int[] nums = {-1, 0, 3, 5, 9, 12};

        int result1 = solution.search(nums, 9);
        System.out.println("Target 9 found at index: " + result1);

        int result2 = solution.search(nums, 2);
        System.out.println("Target 2 found at index: " + result2);
    }

}
