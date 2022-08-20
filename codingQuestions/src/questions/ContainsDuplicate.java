package questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Ivan Lifanica
 */
public class ContainsDuplicate
{
    //conta
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integers  = new HashSet<>();
        for (Integer i :nums){
            integers.add(i);
        }

        return integers.size() != nums.length;
    }

    public boolean containsDuplicateV1(int[] nums){
        Map<Integer,Integer> integers = new HashMap();
        for(Integer i: nums){
            if(integers.get(i) == null){
                integers.put(i,i);
            }else{
                return true;
            }
        }

        return false;
    }

    public boolean containsNearbyDuplicatev1(int[] nums, int k){
        Map<Integer,Integer> integers = new HashMap();
        for(int i =0; i< nums.length; i++){
            if(integers.get(nums[i]) == null){
              integers.put(nums[i],i);
            }else{
                if(Math.abs(integers.get(nums[i]) - i) <= k)
                    return true;
                else{
                    integers.put(nums[i],i);
                }

            }
        }

        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> integers = new HashMap();
        for(int i =0; i< nums.length; i++){
            if(integers.containsKey(nums[i]) && i - integers.get(nums[i])<= k )
                return true;
            integers.put(nums[i], i );
        }
        return false;
    }


}
