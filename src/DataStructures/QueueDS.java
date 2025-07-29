package DataStructures;
import java.util.*;
public class QueueDS {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Person1");
        queue.offer("Person2");
        System.out.println("The elements of Queue: "+queue);
        System.out.println("The popped element is: "+queue.poll());
        System.out.println("The first element of queue is: "+queue.peek());
        System.out.println("Checking if queue is empty: "+queue.isEmpty());
        System.out.println("Size of queue is :"+queue.size());
        System.out.println("Checking if queue contains an element "+queue.contains("Person2"));
    }
}
