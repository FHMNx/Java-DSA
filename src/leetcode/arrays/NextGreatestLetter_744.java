// 744. Find Smallest Letter Greater Than Target//

/* You are given an array of characters letters that is sorted in non-decreasing order, and a character target. 
   There are at least two different characters in letters.*/

 /* Return the smallest character in letters that is lexicographically greater than target. 
   If such a character does not exist, return the first character in letters.*/
package leetcode.arrays;

public class NextGreatestLetter_744 {

    public char nextGreatestLetter(char[] letters, char target) {
        int lowerBound = 0;
        int upperBound = letters.length - 1;

        while (lowerBound <= upperBound) {
            int mid = (lowerBound + upperBound) / 2;

            if (letters[mid] <= target) {
                lowerBound = mid + 1;
            } else {
                upperBound = mid - 1;
            }
        }
        
        if(lowerBound == letters.length){
            return letters[0];
        }

        return letters[lowerBound];

    }

    public static void main(String[] args) {
        NextGreatestLetter_744 solution = new NextGreatestLetter_744();

        char[] letters = {'c', 'f', 'j'};

        char result1 = solution.nextGreatestLetter(letters, 'a');
        System.out.println("Next Traget for target a is : " + result1);

        char result2 = solution.nextGreatestLetter(letters, 'c');
        System.out.println("Next Traget for target c is : " + result2);

        char result3 = solution.nextGreatestLetter(letters, 'z');
        System.out.println("Next Traget for target z is : " + result3);
    }

}
