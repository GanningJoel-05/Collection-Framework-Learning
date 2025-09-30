package CommonAlgorithmsinCollectionsandArrays;

import java.util.*;

public class CommonAlgorithms {
    public static void main(String[] args) {

        // SORTING - Common Algorithms
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(20);
        list.add(60);
        list.add(30);
        list.add(15);

        // sorting in ascending order
        Collections.sort(list);
        System.out.println("\nAscending Sort: \n" +list);

        // descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("\nDescending Sort: \n" +list);

        int[] arr = {42,12,54,76,30};
        Arrays.sort(arr);
        System.out.println("\nThe Sorted Array: \n" +Arrays.toString(arr));

        // SEARCHING - Common Algorithms
        Collections.sort(list); // binary search needs the sorted data
        System.out.println("\nThe Index of the value 60 is: \n" +Collections.binarySearch(list, 60));

        System.out.println("\nThe Index of the value 30 is: \n" +Arrays.binarySearch(arr, 30));

        // SHUFFLING - Common Algorithms
        Collections.shuffle(list);  // random arrangement
        System.out.println("\nThe List after Shuffling: \n" +list);

        // array won't support the shuffling directly.

        // REVERSING - Common Algorithms
        Collections.reverse(list);
        System.out.println("\nThe Reversed List is: \n" +list);

        // MINIMUM AND MAXIMUM - supported by collections alone. Arrays won't support this.
        System.out.println("\nThe Maximum Element in the List: \n" +Collections.max(list));
        System.out.println("\nThe Minimum Element in the List: \n" +Collections.min(list));

        // Filling
        Collections.fill(list, 90);   // replaces all the elements with 90
        System.out.println("\nThe List after filling: \n" +list);

        Arrays.fill(arr, 80);
        System.out.println("\nThe Array after filling: \n" +Arrays.toString(arr));

        // copying
        List<Integer> list1 = new ArrayList<>();
        list1.add(39);
        list1.add(11);
        list1.add(49);
        list1.add(19);
        list1.add(88);
        Collections.copy(list1, list);
        System.out.println("\nThe List-1 after copying: \n" +list1);

        int[] arr1 = Arrays.copyOf(arr, 9);
        System.out.println("\nThe Copied Array is: \n" +Arrays.toString(arr1));

        // Frequency and Disjoint - supported by list alone
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(10);  // frequency - No.of occurrances.
        list2.add(81);
        list2.add(10);
        list2.add(30);
        list2.add(12);
        list2.add(30);
        System.out.println("\nThe Frequency of 10 is: \n" +Collections.frequency(list2, 10));
        System.out.println("\nThe Frequency of 30 is: \n" +Collections.frequency(list2, 30));
    }
}
