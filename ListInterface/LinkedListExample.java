package ListInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        // CREATE A LINKED LIST (THE BEST WAY IS TO CREATE THE LINKED LIST WITH THE LIST REFERENCE)
        List<String> list = new LinkedList<>();

        // created for the linkedlist operations
        LinkedList<String> list1 = new LinkedList<>();

        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        // ADDING SOME ELEMENTS
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // PRINTING THE LIST
        System.out.println(list);

        /* 1) ADDING ELEMENTS
            a) add at end  */
        list.add("PineApple");
        System.out.println("\nList after adding elements at the end: \n" +list);

        // b) inserting at specific position
        list.add(1, "Mango");
        System.out.println("\nList after adding elements at the specific index: \n" +list);

        // c) adding at the beginning
        list.addFirst("Orange");
        System.out.println("\nList after adding element at the starting of the list: \n" +list);

        // d) adding elements at the ending
        list.addLast("Pomegranate");
        System.out.println("\nList after adding the element at the ending of the list: \n" +list);

        // ACCESSING THE ELEMENTS
        // a) getting element at the specified index
        System.out.println("\nThe Element at the specified index is: " +list.get(4));

        // b) getting element at the first and last index
        System.out.println("\nThe Element at the very first index is: " +list.getFirst());
        System.out.println("\nThe Element at the very last index is: " +list.getLast());

        // UPDATING THE ELEMENTS
        // a) update the element at the specified index
        list.set(3, "Guava");
        System.out.println("\nThe List after updating the element at the specified index: \n" +list);

        // REMOVING THE ELEMENTS
        // a) removing the very first element
        list.removeFirst();
        System.out.println("\nThe List after removing the very first element is: \n" +list);

        // b) removing the very last element
        list.removeLast();
        System.out.println("\nThe List after removing the very last element is: \n" +list);

        // c) removing the element at the specified index
        list.remove(4);
        System.out.println("\nList after removing the element at the specified index: \n" +list);

        // d) removing the specified object
        list.remove("Mango");
        System.out.println("\nList after removing the specified object: \n" +list);

        // SEARCHING ELEMENTS
        // a) checking whether the element is present or not.
        System.out.println("\nIs the specified object is present in the list? \n" +list.contains("Apple"));

        // b) checking the index of the entered element
        System.out.println("\nThe index of the specified element is: \n" +list.indexOf("Cherry"));

        // c) checking the last index of the cherry (assuming the list having the duplicate values of cherry)
        list.addLast("Cherry");
        System.out.println("\nThe last index of the specified element is: \n" +list.lastIndexOf("Cherry"));

        // ITERATING THE LIST
        // a) for each loop
        System.out.println("\nIterating the list by using the for each loop: ");
        for(String fruits : list) {
            System.out.println(fruits);
        }

        // b) using the iterator
        System.out.println("\nIterating the list by using the iterator: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // c) using the descending iterator
        System.out.println("\nIterating the list by using the descending iterator: ");
        Iterator<String> it2 = list1.descendingIterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        // STACK AND DEQUE OPERATIONS (LINKED LIST SPECIFIC REFERENCE)
        // a) stack operations
        System.out.println("\nStack Operations: ");
        list1.push("First"); // add at head
        list1.push("Second");
        System.out.println(list1.pop());  // removes and returns head → Second
        System.out.println(list1.peek()); // shows head without removing → First

        // b) queue operations
        System.out.println("\nQueue Operations: ");
        list1.offer("Job1");
        list1.offer("Job2");
        System.out.println(list1.poll()); // removes first element → Job1
        System.out.println(list1.peek()); // shows first element → Job2

        // clearing the list completely
        list.clear();
        System.out.println("\nThe List was cleared successfully!");
        System.out.println(list);

        list1.clear();
        System.out.println("\nThe List was cleared successfully!");
        System.out.println(list1);

//        LinkedList Quick Recap:
//        Add → add(), addFirst(), addLast()
//        Get → get(), getFirst(), getLast()
//        Update → set()
//        Remove → remove(), removeFirst(), removeLast()
//        Iterate → for-each, iterator(), descendingIterator()
//        Stack → push(), pop(), peek()
//        Queue → offer(), poll(), peek()

    }
}