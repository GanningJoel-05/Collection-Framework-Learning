package ListInterface;

import java.util.Vector;

public class VectorClassImplementation {
    public static void main(String[] args) {

       // create a vector
        Vector<Integer> vector = new Vector<>();

        // add some elements
        vector.add(10);
        vector.add(10);
        vector.add(10);
        vector.add(10);
        vector.add(10);
        vector.addElement(10);  // legacy method of vector
        vector.addFirst(10);
        vector.addLast(10);
        System.out.println("\nThe Vector is: \n" +vector);

        // accessing elements
        System.out.println("\nThe Element at the index 4: \n" +vector.get(4));
        System.out.println("The Element at the index (using the legacy method): \n" +vector.elementAt(6));
        System.out.println("The First Element is: \n" +vector.getFirst());
        System.out.println("The Second Element is: \n" +vector.getLast());

        // updating the elements
        vector.set(5, 21);
        System.out.println("\nThe Vector After Updating: \n" +vector);
        vector.setElementAt(100, 4);
        System.out.println("\nThe Vector after updating (by using the legacy method): \n" +vector);

        // removing elements
        vector.remove(2);
        System.out.println("\nThe Vector after removing that element: \n" +vector);
        vector.remove(1);
        System.out.println("The Vector after removing the element again: \n" +vector);
        vector.removeElementAt(5);
        System.out.println("The Vector after removing the element (using legacy method): \n" +vector);
        vector.removeAllElements();
        System.out.println("The Vector after removing all elements: \n" +vector);

//        Other Useful Methods
//
//        size() → returns number of elements.
//        capacity() → returns current capacity.
//        contains(Object o) → checks if element exists.
//        indexOf(Object o) → returns index of element.
//        isEmpty() → checks if empty.
//        clone() → creates shallow copy.
//        toArray() → converts vector to array.
//        elements() → returns Enumeration (legacy iterator).
    }
}
