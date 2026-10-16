package leetcode.arrays;

public class SearchRotatedSortedArray_33 {

    public int search(int[] nums, int target) {
        int lowerBound = 0;
        int upperBound = nums.length - 1;

        while (lowerBound <= upperBound) {
            int mid = lowerBound + (upperBound - lowerBound) / 2;

            //if target found
            if (nums[mid] == target) {
                return mid;
            }

            //if left half of the arrys is sorted
            if (nums[lowerBound] <= nums[mid]) {

                // Is target inside the sorted left half?
                if (nums[lowerBound] <= target && target < nums[mid]) {
                    upperBound = mid - 1;
                } else {
                    lowerBound = mid + 1;
                }

            } else { //if right half of the arrys is sorted

                // Is target inside the sorted right half?
                if (nums[mid] < target && target <= nums[upperBound]) {
                    lowerBound = mid + 1;
                } else {
                    upperBound = mid - 1;
                }
            }
        }
        
        return -1;
        
    }

    public static void main(String[] args) {
        SearchRotatedSortedArray_33 solution = new SearchRotatedSortedArray_33();

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(solution.search(nums, 0));
        System.out.println(solution.search(nums, 3));

        int[] nums2 = {1};
        System.out.println(solution.search(nums2, 0));
    }

}
