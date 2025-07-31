package DataStructures;
import java.util.*;
//Priority Queue returns the elements in an arranged order which is different from the normal queue data structure
public class PriorityQueueDS {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>();
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
