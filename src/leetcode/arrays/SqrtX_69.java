/**
 * 69. Sqrt(x)
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
 * The returned integer should be non-negative as well.
 * You must not use any built-in exponent function or operator.
 *
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 *
 * Example 1:
 *
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 * Example 2:
 *
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 *
 */
package leetcode.arrays;

public class SqrtX_69 {

    public int mySqrt(int x) {
        int lowerBound = 0;
        int upperBound = x;
        int answer = 0;

        while (lowerBound <= upperBound) {
            int mid = lowerBound + (upperBound - lowerBound);

            int square = mid * mid;
            if (square == x) {
                return mid;
            } else if (square < x) {
                lowerBound = mid + 1;
            } else {
                upperBound = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SqrtX_69 solution = new SqrtX_69();

        System.out.println("sqrt(4) = " + solution.mySqrt(4));
    }

}
