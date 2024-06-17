from __future__ import annotations
import math

class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        def checkVal(v):
            totalTime = 0
            for p in piles:
                totalTime += math.ceil(float(p) / v)
            return totalTime <= h

        lo = 1
        hi = max(piles)

        while lo <= hi:
            mid = int((lo + hi) / 2)
            if not checkVal(mid):
                lo = mid + 1
            else:
                hi = mid - 1
        
        if checkVal(mid):
            return mid
        else:
            return mid + 1
        


            


        
        
        