package Setinterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetLearning {

    // creating the constructor
    public Integer age;

    public LinkedHashSetLearning(Integer age) {
        this.age =age;
    }

    public static void main(String[] args) {

        // creating the linked-hashset
        LinkedHashSet<Integer> integers = new LinkedHashSet<>();  // learning purpose (avoid using this) - Tightly Coupled (Further modifications are not allowed)
        Set<Integer> set = new LinkedHashSet<>();  // professional and easily modifiable way (use this one) - Loosely Coupled (Further Modifications are allowed)

        // adding elements
        set.add(23);
        set.add(34);
        set.add(12);
        set.add(88);
        set.add(22);
        set.add(34); // duplicates will be ignored by the set here. unique ones will be allowed
        System.out.println("\nThe Initial LinkedHashSet is: \n" +set);   // 34 will be added once and the same insertion order will be maintained.

        // printing using for each loop
        System.out.println("\nThe LinkedHashSet using for each loop: ");
        for (Integer num : set) {
            System.out.print(num + " ");
        }

        // adding null value - allowed
        set.add(null);
        System.out.println("\n\nThe LinkedHashSet after adding the null value is: \n" +set);

        // trying to add another null value
       set.add(null); // adding another null will be simply ignored by the LinkedHashSet. In TreeSet, adding null will throw an exception.
        System.out.println("\nThe LinkedHashSet after adding another null value is: \n" +set);   // same LinkedHashSet will be printed with the previously added null.

        // adding elements using objects - new try
        LinkedHashSetLearning s1 = new LinkedHashSetLearning(19);
        set.add(s1.age);
        System.out.println("\nThe LinkedHashSet after adding an element using the object: \n" +set);

        // removes the element
        set.remove(40);  // 40 not present. so no elements will be removed. same set will be printed
        System.out.println("\nThe LinkedHashSet after removing an element is: \n" +set);
        set.remove(34);  // 34 is removed. because it is present inside the list
        System.out.println("\nThe LinkedHashSet after removing another element is: \n" +set);

        // size
        System.out.println("\nThe Size of the LinkedHashSet is: \n" +set.size());  // 5

        // isEmpty
        System.out.println("\nIs the LinkedHashSet is Empty? \n" +set.isEmpty());  // false

        // checking the elements
        System.out.println("\nIs the mentioned element is present in the LinkedHashSet? \n" +set.contains(22));  // true
        System.out.println("\nIs the mentioned element is present in the LinkedHashSet? \n" +set.contains(900));  // false

        // Clearing all elements
        set.clear();
        System.out.println("\nThe LinkedHashSet after clearing all elements is: \n" +set);
    }
}
