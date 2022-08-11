package questions;

import java.util.*;


/**
*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
*<p>
*You may assume that each input would have exactly one solution, and you may not use the same element twice.
*<p>
*You can return the answer in any order.
 * <p>
 *     <blockquote><pre>
*Input: nums = [2,7,11,15], target = 9
*Output: [0,1]
*Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *  </pre></blockquote>
 * @author Ivan Lifaniça
*/
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
