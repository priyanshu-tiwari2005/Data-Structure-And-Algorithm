import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {

        // Max Heap
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones
        for (int stone : stones) {
            pq.add(stone);
        }

        // Keep smashing two largest stones
        while (pq.size() > 1) {

            int x = pq.poll();
            int y = pq.poll();

            if (x != y) {
                pq.add(x - y);
            }
        }

        // If one stone remains
        if (pq.isEmpty()) {
            return 0;
        }

        return pq.peek();
    }
}