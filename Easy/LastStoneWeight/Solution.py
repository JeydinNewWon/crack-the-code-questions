import heapq

class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        prio_q = [-1 * s for s in stones]
        heapq.heapify(prio_q)

        while len(prio_q) > 1:
            s1 = -1 * heapq.heappop(prio_q)
            s2 = -1 * heapq.heappop(prio_q)

            if s1 != s2:
                heapq.heappush(prio_q, -1 * (max(s1, s2) - min(s1, s2)))

        if len(prio_q) == 0:
            return 0
        
        return -1 * heapq.heappop(prio_q)
