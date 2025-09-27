package queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeExample {
    public static void main(String[] args) {

        // create an array deque
        Queue<Integer> s1 = new ArrayDeque<>();  // Frequently used - Loosely Coupled  -- ALWAYS PROGRAM TO AN INTERFACE NOT THE IMPLEMENTATION
        // ArrayDeque is faster than LinkedList for queue operations and should be preferred unless thread safety is needed
        ArrayDeque<Integer> s2 = new ArrayDeque<>(); // Rarely used - Tightly Coupled
        // ArrayDeque is not synchronized (not thread-safe). External synchronization is needed if used by multiple threads
        Deque<String> s3 = new ArrayDeque<>(); // ArrayDeque as Deque
        // Used where elements need to be inserted and removed from both ends efficiently

        // adding some elements
        s1.offer(20);
        s1.offer(45);
        s1.offer(37);
        s1.offer(90);
        s1.offer(63);
        s1.add(56);   // Throws Exception when not able to add
        // add() can throw IllegalStateException if capacity restrictions are violated, unlike offer() which returns false
        s1.add(36);
        s1.add(23);
        System.out.println("\nThe Initial Arraydeque is: \n" +s1);

        // removing the elements (FIFO Principle will be strictly followed)
        System.out.println("\nThe Removed First element in the ArrayDeque is: \n" +s1.poll());
        System.out.println("\nThe ArrayDeque after removing the first element: \n" +s1);
        System.out.println("\nThe Again Removed First element in the ArrayDeque is: \n" +s1.poll());
        System.out.println("\nThe ArrayDeque after removing the first element again: \n" +s1);
        System.out.println("\nThe and Again Removed First element in the ArrayDeque is: \n" +s1.remove());  // does the same as the poll, but will throw exception once it was empty
        // remove() throws NoSuchElementException if the deque is empty

        System.out.println("\nThe ArrayDeque after removing the first element and again: \n" +s1);

        // adding some elements again
        s1.offer(34); // added at the end
        System.out.println("\nThe ArrayDeque after adding the element again: \n" +s1);

        // returns the first element of the Arraydeque without removing it.
        System.out.println("\nThe First Element of the Arraydeque using element(): \n" +s1.element()); // throws exception if empty
        System.out.println("\nThr First Element of the Arraydeque using peek(): \n" +s1.peek()); // returns null if empty

        // contains method
        System.out.println("\nIs the mentioned element is present in the ArrayDeque? \n" +s1.contains(56));

        // HashCode Checking
        System.out.println("\nThe HashCode of the given ArrayDeque is: \n" +s1.hashCode());

        // checking if the ArrayDeque is empty or not??
        System.out.println("\nIs the ArrayDeque is Empty? \n" +s1.isEmpty());

        // printing each and every element using the for each loop
        System.out.println("\nThe Elements of the ArrayDeque using the for each loop is: ");
        for (Integer num : s1) {
            System.out.print(num + " ");
        }

        // clearing all the elements in the ArrayDeque.
        s1.clear();
        System.out.println("\n\nThe ArrayDeque after clearing all the elements is: \n" +s1);

        // ARRAYDEQUE AS A DEQUE
        s3.addFirst("Joel");  // added first
        s3.add("Sachin");     // added in some order
        s3.addLast("Rohit");  // added at the end
        s3.add("Hardik");     // added after the previous end element
        System.out.println("\nThe ArrayDeque (Deque) elements by adding: \n" +s3);

        s3.offerFirst("Ms Dhoni"); // added first
        s3.offer("Krunal");        // added after hardik at last
        s3.offerLast("Virat");     // added after the krunal at the last
        s3.offer("Bumrah");        // added after the virat at the last
        System.out.println("\nThe ArrayDeque (Deque) elements by offering: \n" +s3);

        s3.remove();   // Ms Dhoni will be removed (FIFO principle of Queue - Deque Implements the Queue)
        System.out.println("\nThe ArrayDeque (Deque) after removing the element: \n" +s3);
        s3.remove("Rohit");  // Rohit will be removed
        System.out.println("\nThe ArrayDeque (Deque) after removing the element: \n" +s3);
        s3.removeFirst();  // Joel will be removed now
        System.out.println("\nThe ArrayDeque (Deque) after removing the first element: \n" +s3);
        s3.removeLast();   // Bumrah will be removed now
        System.out.println("\nThe ArrayDeque (Deque) after removing the last element: \n" +s3);
        s3.pop();          // sachin will be removed now (FIFO)
        System.out.println("\nThe ArrayDeque (Deque) after removing the first element (pop): \n" +s3);
        System.out.println("\nThe fist element of the arraydeque (deque) is (peek): \n" +s3.peek());    // Hardik
        System.out.println("\nThe fist element of the arraydeque (deque) is (peekfirst): \n" +s3.peekFirst());  // Hardik
        System.out.println("\nThe last element of the arraydeque (deque) is: \n" +s3.peekLast()); // Virat

        s3.poll();    // Hardik will be removed first (FIFO)
        System.out.println("\nThe arraydeque (deque) after removing the first element: (poll): \n" +s3);
        s3.pollFirst();  // Krunal will be removed now (FIFO)
        System.out.println("\nThe arraydeque (deque) after removing the first element: \n" +s3);
        s3.offer("Manish");
        s3.offer("Bhuvi");

        s3.pollLast(); // bhuvi will be removed now
        System.out.println("\narraydeque (deque) after removing the last element: \n" +s3);

        // adding the stack method
        s3.push("Ganning");       // added at very first (FIFO).
        System.out.println("\nThe ArrayDeque (Deque) after adding the element using the push method: \n" +s3);

        System.out.println("\nThe first element of the deque is: \n" +s3.getFirst()); // throws exception if empty
        System.out.println("\nThe last element of the deque is: \n" +s3.getLast());   // throws exception if empty


        // REMAINING ALL METHODS ARE SAME AS USED PREVIOUS
        // ArrayDeque is widely used in BFS, task scheduling, and undo operations where fast addition/removal from both ends is required
    }
}
