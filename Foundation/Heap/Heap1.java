package Foundation.Heap;

import java.util.PriorityQueue;

public class Heap1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.add(90);
        pq.add(10);
        pq.add(70);
        pq.add(80);
        pq.add(50);

        // pq.poll();
       

        System.out.println(pq.peek());

        System.out.println("Heap is: " + pq);
    }
}

// every heap has 2 methods one throws exception while other does not

// add <=> offer
// peek <=> poll
