package Setinterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {
    public static void main(String[] args) {

        // CREATING THE HASH SET   (ORDER IS NOT PRESERVED - TEND TO CHANGE)
        HashSet<Integer> hashSet = new HashSet<>();

        // ADDING ELEMENTS IN HASH SET
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);
        // hashSet.add(50); Duplicate elements will be ignored (cannot be added in the list)

        // PRINTING THE ELEMENTS IN THE LIST
        System.out.println("\nThe HashSet is: \n" +hashSet);  // insertion order will be changed here

        // using for each loop
        System.out.println("\nPrinting the Elements by using the for each loop: ");
        for (Integer num : hashSet) {
            System.out.print(num + " ");
        }

        // removing elements in hashset
        hashSet.remove(40);   // here 40 is an element or object not an index
        System.out.println("\n\nHashSet after removing the elements: \n" +hashSet);

        // check the elements presence
        System.out.println("\nIs the entered element is present inside the hashset?? \n" +hashSet.contains(40));

        // size of the hashset
        System.out.println("\nThe Size of the HashSet is: \n" +hashSet.size());

        // isEmpty()
        System.out.println("\nIs the HashSet is Empty?? \n" +hashSet.isEmpty());

        // adding the null value here
        hashSet.add(null);
        hashSet.add(null);  // will be ignored - because hashset allows only one null value
        System.out.println("\nThe HashSet after adding null: \n" +hashSet);

        // printing the elements using the iterator
        Iterator<Integer> iterator = hashSet.iterator();
        System.out.println("\nElements printed using the Iterator: ");
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.print(element + " ");
        }

        // clearing all the elements in the hashset
        hashSet.clear();
        System.out.println("\n\nThe Hashset after clearing all the elements: \n" +hashSet);
    }
}
