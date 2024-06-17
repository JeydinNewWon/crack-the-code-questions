from __future__ import annotations

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hmap = {}
        for i in range(len(nums)):
            num = nums[i]
            if target - num in hmap:
                return [hmap[target - num], i]
            else:
                hmap[num] = i
            

        