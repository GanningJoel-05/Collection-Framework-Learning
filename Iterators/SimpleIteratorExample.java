package Iterators;

import java.util.*;

public class SimpleIteratorExample {
    public static void main(String[] args) {

        // create an arraylist
        List<Integer> list = new ArrayList<>();

        // add some elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("\nThe ArrayList is; \n" +list);

        // using the iterator
        System.out.println("\nThe ArrayList elements the enhanced for loop: ");
        for (Integer num : list) {
            System.out.print(num + " ");
        }

        // using the iterator
        System.out.println("\n\nThe ArrayList elements using the iterator: ");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            System.out.print(num + " ");
        }

        // linked list
        List<Integer> list1 = new LinkedList<>();   // replace this linked list with any List, Set, Queue implementations (same Process for all implementations).
        /* (i.e) :
                List<Integer> list2 = new Stack<>();
                Queue<Integer> queue = new PriorityQueue<>();
                Queue<String> queue1 = new ArrayDeque<>();
                etc.......
        */

        // add elements
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        System.out.println("\n\nThe LinkedList elements are: \n" +list1);

        // iterator
        System.out.println("\nThe LinkedList elements using the iterator: ");
        Iterator<Integer> iterator1 = list1.iterator();
        while (iterator1.hasNext()) {
            Integer num1 = iterator1.next();
            System.out.print(num1 + " ");
        }

        // removing the elements using the iterator.remove()
        iterator1.remove();  // manually removes the last element
        System.out.println("\n\nThe LinkedList after removing the element using the remove(): \n" +list1);

        // here, most of the implementations will have the same common iterator. But the List Interface has a special iterator named as LIST ITERATOR
        // where, we can do both the forward and backward iteration (only in the List Interface alone).

        ListIterator<Integer> listIterator = list.listIterator();

        // forward iteration
        System.out.println("\nThe Forward Iteration of the List Interface: ");
        while (listIterator.hasNext()) {
            Integer nums = listIterator.next();
            System.out.print(nums + " ");
        }

        // reversed iteration
        System.out.println("\n\nThe Reversed Iteration of the List Interface: ");
        while (listIterator.hasPrevious()) {
            Integer nums1 = listIterator.previous();
            System.out.print(nums1 + " ");
        }

        // creating the map
        Map<String, Integer> map = new HashMap<>();

        // add some elements
        map.put("Joel", 49);
        map.put("Paul", 18);
        map.put("Raju", 34);
        map.put("Kishore", 66);
        map.put("Prem", 99);
        System.out.println("\n\nThe Pairs in the HashMap are: \n" +map);

        // using iterator
        Iterator<Map.Entry<String, Integer>> iterator2 = map.entrySet().iterator();
        System.out.println("\nThe Elements in the map using the iterator is: ");
        while (iterator2.hasNext()) {
            Map.Entry<String, Integer> maps = iterator2.next();
            System.out.print(maps.getKey() + "=>" +maps.getValue() + " ");
        }
    }
}
