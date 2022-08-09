/*
 * Copyright (c) 2003-2011 CEDSIF. All rights reserved.
 */
package questions;

import java.sql.Array;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ivan Lifaniça
 */

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSum {



    public int[] twoSum(int[] nums, int target){

        for(int i = 0;i<nums.length;i++){
            for(int e = 1;e<nums.length;e++){
                if(nums[i] + nums[e] == target)
                    return new int[]{i,e};
            }
        }
        return nums;
    }

    public int[] twoSumWithMap(int[] nums, int target){
        Map<Integer, Integer> complements = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            Integer complementIndex = complements.get(nums[i]);
            if(complementIndex != null)
                return new int[] {complementIndex, i};
            complements.put(target - nums[i], i);
        }
        return nums;
    }
}
