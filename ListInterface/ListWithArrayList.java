package ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListWithArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();   // when to use: general usage

        // add elements (adding elements at the end)  =>  TC = O(1)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("\nThe Original List: " +list);

        // FOR EACH LOOP FOR PRINTING
        System.out.println("\nThe original list (using for each loop): ");
        for (Integer output : list) {
            System.out.print(output + " ");
        }

        // ITERATOR FOR PRINTING
        System.out.println("\n\nIterating with Iterator: ");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // Inserting element at the specific index => TC = O(n)
        list.add(2, 89);
        System.out.println("\n\nThe List after Inserting: " +list);

        // to get (or) access the elements   => TC = O(1)
        System.out.println("\nThe Element at index-4: " +list.get(4));

        // Replacing the elements => TC = O(1)
        int oldValue = list.set(1, 78);
        System.out.println("\nReplaced " + oldValue + " with 78");
        System.out.println("Updated list: " + list);

        // removing the element at the specific index => TC = O(n)
        list.remove(4);
        System.out.println("\nThe List after removing the element: " +list);

        // size of the list => TC = O(1)
        System.out.println("\nThe Size of the list: " +list.size());

        // duplicate entry with index checking
        list.add(10);
        System.out.println("\nLast index of 10: " + list.lastIndexOf(10));


        // check whether the list is empty => TC = O(1)
        System.out.println("\nIs the list is empty? " +list.isEmpty());

        // check if the elements are exist => TC = O(n)
        System.out.println("\nIs 10 is present on the list? " +list.contains(10));

        // find the index of the value => TC = O(n)
        System.out.println("\nThe Index value of the element: " +list.indexOf(10));

        // sorting the list
        Collections.sort(list);
        System.out.println("\nThe List After sorting: " +list);

        // reversing the list
        Collections.reverse(list);
        System.out.println("\nThe List After reversing: " +list);

        // to delete all the elements => TC = O(n)
        list.clear();
        System.out.println("\nThe List was cleared successfully!");

        // ARRAYLIST (DYNAMIC ARRAY)
        ArrayList<Integer> list1 = new ArrayList<>();   // When to use: Fast index-based access (sub array problems, dynamic arrays, storing results).
        list1.ensureCapacity(20);
    }
}
