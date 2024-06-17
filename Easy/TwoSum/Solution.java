package Easy.TwoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (hMap.containsKey(target -  num)) {
                return new int[] { hMap.get(target - num), i};
            } else {
                hMap.put(num, i);
            }
        }

        return new int[] {};
    }
}
