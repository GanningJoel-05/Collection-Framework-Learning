package queue_interface;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        // create a Priority Queue
        PriorityQueue<String> s1 = new PriorityQueue<>();  // tight coupling - rarely used

        Queue<String> s2 = new PriorityQueue<>();  // loose coupling - widely used

        // adding elements
        s2.add("Joel");       // throws exception if any error occurs
        s2.add("Mukesh");
        s2.add("Paul");
        s2.offer("Santhosh");
        s2.offer("Antony");
        s2.offer("Praveen");  // elements will be added in any order.
        System.out.println("\nThe Priority Queue is: \n" + s2);

        // accessing the head element - FIFO is not followed here. The element with the highest priority will be given the preference first
        System.out.println("\nThe Head Element using the peek(): \n" + s2.peek());   // element with the lowest alphabetical order.

        try {
            // s2.clear(); will throw the exception when clear is used here.
            System.out.println("\nThe Head Elements using the element(): \n" + s2.element());  // same as peek. but throws exception when the queue is empty
        } catch (Exception e) {
            System.out.println("\nException: An Error Occurred! " + e.getMessage());
        }

        // removing the elements
        s2.remove();  // removing the element with maximum priority
        System.out.println("\nThe Priority queue after removing the element: \n" + s2);
        s2.remove("Paul");    // removes the specific elements
        System.out.println("\nThe Priority Queue after removing the mentioned element: \n" + s2);
        s2.poll(); // same as the remove() and specific elements can't be removed here.
        System.out.println("\nThe Priority Queue after removing the Element: \n" + s2);

        // checking the element's availability
        System.out.println("\nIs the mentioned element is present inside the queue? \n" + s2.contains("Joel"));
        System.out.println("\nIs the mentioned element is present inside the queue? \n" + s2.contains("Praveen"));

        // printing the elements
        System.out.println("\nPrinting the Elements using the for-each loop: ");
        for (String names : s2) {
            System.out.print(names + " ");
        }

        // size and empty and clear
        System.out.println("\n\nThe Size of the Queue is: \n" + s2.size());
        System.out.println("\nIs the Priority Queue is Empty? \n" + s2.isEmpty());
        s2.clear();
        System.out.println("\nThe Priority Queue after clearing all elements: \n" + s2);
    }
}
