package queue_interface;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueAndDequeExample {
    public static void main(String[] args) {

        // creating a LinkedList (as a Queue)
        Queue<Integer> q1 = new LinkedList<>();

        // adding some elements
        q1.add(20);  // adds element (throws exception if capacity restrictions prevent adding)
        q1.offer(12); // adds element (returns false if capacity restrictions prevent adding)
        q1.offer(23);
        q1.offer(34);
        q1.offer(58);
        q1.offer(67);
        System.out.println("\nThe LinkedList (Queue) after adding elements: \n" + q1);

        // accessing the head element (without removing it)
        System.out.println("\nThe First Element (Head) of the Queue is: \n" + q1.peek());  // returns null if empty

        // removing the elements from the queue (FIFO principle)
        q1.remove(); // removes the head element; throws exception if empty
        System.out.println("\nThe Queue after removing the head element is: \n" + q1);

        q1.remove(34); // removes specific element if present
        System.out.println("\nThe Queue after removing a specific element (34) is: \n" + q1);

        q1.poll();  // removes and returns the head; returns null if empty
        System.out.println("\nThe Queue after removing the head element (poll): \n" + q1);

        // checking if queue is empty
        System.out.println("\nIs the Queue Empty? \n" + q1.isEmpty());

        // element() method (like peek but throws exception if queue is empty)
        System.out.println("\nThe First element of the queue (using element()): \n" + q1.element());

        // contains() method
        System.out.println("\nIs the mentioned element (58) present in the queue? \n" + q1.contains(58));

        // clear() method
        q1.clear();
        System.out.println("\nThe Queue after clearing all the elements: \n" + q1);

        // --------------------------------------
        // LINKED LIST AS A DEQUE
        // --------------------------------------
        Deque<Integer> d1 = new LinkedList<>();

        // adding elements to deque (both ends supported)
        d1.add(34);          // adds at tail (end)
        d1.add(33);          // adds at tail
        d1.offer(24);        // adds at tail
        d1.offerFirst(78);   // adds at head (front)
        d1.offerLast(35);    // adds at tail (end)
        System.out.println("\nThe Deque (LinkedList) after adding elements: \n" + d1);

        // removing elements (from both ends)
        d1.removeFirst();  // removes element from head
        System.out.println("\nThe Deque after removing first element: \n" + d1);

        d1.removeLast();   // removes element from tail
        System.out.println("\nThe Deque after removing last element: \n" + d1);

        // peeking elements
        System.out.println("\nThe First Element (Head) of the Deque: \n" + d1.peekFirst());
        System.out.println("\nThe Last Element (Tail) of the Deque: \n" + d1.peekLast());

        // iterating using for-each loop
        System.out.println("\nIterating through the Deque elements: ");
        for (Integer num : d1) {
            System.out.print(num + " ");
        }
    }
}
