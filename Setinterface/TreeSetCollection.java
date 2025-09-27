package Setinterface;

import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args) {

        // create a tree set
        TreeSet<Integer> treeSet = new TreeSet<>();

        // adding the elements
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(30);
        treeSet.add(50);

        // printing the tree set
        System.out.println("\nThe Integer Tree Set is: \n" +treeSet);  // sorted in ascending order

        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Ganning");
        treeSet1.add("Paul");
        treeSet1.add("Abdul");
        treeSet1.add("Kishore");
        treeSet1.add("Cyril");

        System.out.println("\nThe String Tree Set is: \n" +treeSet1);   // sorted in alphabetical order

        // treeSet.add(null);   throws exception
        try {
            treeSet.add(null);
        }
        catch (Exception e) {
            System.out.println("\nException: An Error Occurred! " +e.getMessage());
            System.out.println("Tree Set after adding null:\n" +treeSet);  // null cannot be added here
        }

        // using floor(), ceiling(), higher(), lower()
        System.out.println("\nThe Floor value of the Tree Set is: \n" +treeSet.floor(50));  // returns less than or equal value of the given number
        System.out.println("\nThe Ceil Value of the Tree Set is: \n" +treeSet.ceiling(20)); // returns more than or equal value of the given number
        System.out.println("\nThe Next greater element of the mentioned one: \n"+ treeSet.higher(30)); // returns the next greatest element of the given number
        System.out.println("\nThe Next smallest element of the mentioned one: \n"+ treeSet.lower(30)); // returns the next smallest element of the given number

        // removing the elements
        treeSet.remove(30);  // particular mentioned element will be removed
        System.out.println("\nThe Tree Set after removing the element: \n" +treeSet);

        treeSet1.remove("Paul");
        System.out.println("\nThe Tree Set after removing the element again: \n" +treeSet1);

        // checking the element
        System.out.println("\nIs the Mentioned Element is is present in the tree set? \n" +treeSet.contains(10));   // returns true
        System.out.println("\nIs the Mentioned Element is is present in the tree set? \n" +treeSet.contains(200));  // returns false

        // getting the size
        System.out.println("\nThe Size of the Tree Set: \n" +treeSet.size());

        //printing in the for each loop
        System.out.println("\nThe Tree Set using the for each loop: ");
        for (Integer num : treeSet) {
            System.out.print(num + " ");
        }

        // isEmpty()
        System.out.println("\n\nIs the tree set is empty? \n" +treeSet.isEmpty());

        // clear()
        treeSet.clear();
        System.out.println("\nThe Tree Set after clearing all the elements: \n" +treeSet);
    }
}
