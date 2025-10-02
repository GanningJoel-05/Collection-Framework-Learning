package CustomComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomComparatorExample {
    public static void main(String[] args) {

        // create a arraylist
        List<Integer> list = new ArrayList<>();
        list.add(42);
        list.add(12);
        list.add(33);
        list.add(32);
        list.add(56);
        list.add(15);

        // ascending order list
        Collections.sort(list);
        System.out.println("\nThe ArrayList is: \n" +list);

        // printing the descending order of the list using the comparator
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {

                if (num1 < num2) {
                    return 1;
                }
                else if(num1 > num2) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("\nThe Descending order of the ArrayList is: \n" +list);
    }
}