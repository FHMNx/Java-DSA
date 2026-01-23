/*
 Problem: Two Sum
 Source: LeetCode
 Difficulty: Easy

 Approach:
 Use a HashMap to store visited numbers.
 For each element, calculate the required value (target - current).
 If it exists in the map, return the indices.

 Time Complexity: O(n)
 Space Complexity: O(n)
*/

import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap();

        for(int i = 0; i < nums.length; i++){

            int needed = target - nums[i];

            if(map.containsKey(needed)){
                return new int[]{map.get(needed), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};


    }
}