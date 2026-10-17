/**
 * 278. First Bad Version
 *
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version.
 * You should minimize the number of calls to the API.
 *
 * */
package leetcode.arrays;

public class FirstBadVersion_278 {
    
    private static final int FIRST_BAD_VERSION = 4; 
    
    private boolean isBadVersion(int version){
        return version >= FIRST_BAD_VERSION;
    }

    public int FirstBadVersion(int n) {
        int lowerBound = 1;
        int upperBound = n;
        
        while (lowerBound < upperBound) {            
            int mid = lowerBound + (upperBound - lowerBound) / 2;
            if(isBadVersion(mid)){
                upperBound = mid;
            }else{
                lowerBound = mid + 1;
            }
        }
        
        return lowerBound;
    }

    public static void main(String[] args) {
        FirstBadVersion_278 solution = new FirstBadVersion_278();

        int n = 5;
        System.out.println("First Bad Versoion is : " + solution.FirstBadVersion(n));

        FirstBadVersion_278.firstBadVersionTest();
    }

    public static void firstBadVersionTest() {
        FirstBadVersion_278 solution = new FirstBadVersion_278();
        System.out.println("First Bad Versoion is : " + solution.FirstBadVersion(1));
    }

}
