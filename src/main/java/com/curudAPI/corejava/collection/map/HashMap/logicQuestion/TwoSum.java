package org.example.corejava.collection.map.HashMap.logicQuestion;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            
            if (numMap.containsKey(diff)) {
                return new int[] { numMap.get(diff), i };
            }
            
            numMap.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
