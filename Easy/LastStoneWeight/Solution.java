package Easy.LastStoneWeight;

import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue();
        for (int stone : stones) maxHeap.add(-stone);

        while (maxHeap.size() > 1) {
            int stone1 = -1 * maxHeap.poll();
            int stone2 = -1 * maxHeap.poll();

            if (stone1 != stone2) {
                maxHeap.add(-1 * (stone1 - stone2));
            }
        } 

        if (maxHeap.isEmpty()) return 0;

        return -1 * maxHeap.poll();
    }
}