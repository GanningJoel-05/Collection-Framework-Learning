package CustomComparatorExample;

import java.util.*;

class Students {
    String name;
    int marks;

    Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "(" + name + ")";
    }
}

public class RealLifeExample {
    public static void main(String[] args) {

        Comparator<Students> comparator = (s1, s2) -> {
            if (s1.marks != s2.marks)
                return Integer.compare(s1.marks, s2.marks);
            return s1.name.compareTo(s2.name);
        };

        // --------- LIST ---------
        List<Students> list = new ArrayList<>();
        list.add(new Students("Joel", 90));
        list.add(new Students("Kishore", 75));
        list.add(new Students("Prem", 90));
        list.add(new Students("Raju", 85));

        Collections.sort(list, comparator);
        System.out.println("\nSorted List: \n" +list);

        // ---------- ARRAY ----------
        Students[] arr = {new Students("Paul", 85), new Students("David", 70), new Students("Anto", 85)};

        Arrays.sort(arr, comparator);
        System.out.println("\nSorted Array: \n" +Arrays.toString(arr));

        // ---------- TREESET ----------
        Set<Students> set = new TreeSet<>(comparator);
        set.add(new Students("Xavier", 55));
        set.add(new Students("Yuvan", 99));
        set.add(new Students("Arun", 55));  // use the comparator to decide the position

        System.out.println("\nTree-Set (auto-sorted): \n" +set);

        // ---------- TREEMAP ----------
        Map<Students, String> map = new TreeMap<>(comparator);
        map.put(new Students("Mani", 50), "Section-A");
        map.put(new Students("Bhavani", 95), "Section-B");
        map.put(new Students("Aravind", 50), "Section-C");

        System.out.println("\nTree-Map (auto-sorted): \n" +map);
    }
}
