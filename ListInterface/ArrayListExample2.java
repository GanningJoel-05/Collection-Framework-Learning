package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("\nInitial Array List: " +list);

        // index
        System.out.println("Element at Index 2: " +list.get(2));
        System.out.println("Element at Index first: " +list.getFirst());
        System.out.println("Element at Index Last: " +list.getLast());

        list.remove(4);
        System.out.println("List After Removing: " +list);
        System.out.println("Is ArrayList is Empty? " +list.isEmpty());
        System.out.println("Size of ArrayList: " +list.size());
        System.out.println("Reversed ArrayList: " +list.reversed());
        list.set(0, 99);
        System.out.println("ArrayList after Updating: " +list);
    }
}
