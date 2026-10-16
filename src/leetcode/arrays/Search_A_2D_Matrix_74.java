/**
 * 74. Search a 2D Matrix
 * You are given an m x n integer matrix matrix with the following two properties:
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise. You must write a solution in O(log(m * n)) time complexity.
 * */
package leetcode.arrays;

public class Search_A_2D_Matrix_74 {

    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length; //3 rows
        int columns = matrix[0].length; // 4 columns

        int lowerBound = 0; //0
        int upperBound = rows * columns - 1; //11

        while (lowerBound <= upperBound) {
            int mid = lowerBound + (upperBound - lowerBound) / 2;  //5
            int row = mid / columns;
            int column = mid % columns;

            int middleValue = matrix[row][column];
            if (middleValue == target) {
                return true;
            } else if (middleValue < target) {
                lowerBound = mid + 1;
            } else {
                upperBound = mid - 1;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        Search_A_2D_Matrix_74 solution = new Search_A_2D_Matrix_74();

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target1 = 3;
        int target2 = 13;

        boolean result1 = solution.searchMatrix(matrix, target1);
        boolean result2 = solution.searchMatrix(matrix, target2);

        System.out.println("Traget " + target1 + " Found : " + result1);
        System.out.println("Traget " + target2 + " Found : " + result2);
    }

}
