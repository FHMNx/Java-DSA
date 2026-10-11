// 35. Search Insert Position
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.
package leetcode.arrays;

public class SearchInsert_35 {

    public int searchInsert(int[] nums, int target) {
        int lowerBound = 0;
        int upperBound = nums.length - 1;

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

        return lowerBound;

    }

    public static void main(String[] args) {
        SearchInsert_35 solution = new SearchInsert_35();

        int[] nums = {1, 3, 5, 6};

        int result1 = solution.searchInsert(nums, 5);
        System.out.println("Target 5 found at index: " + result1);

        int result2 = solution.searchInsert(nums, 2);
        System.out.println("Target 2 found at index: " + result2);

        int result3 = solution.searchInsert(nums, 7);
        System.out.println("Target 7 found at index: " + result3);
    }
}
