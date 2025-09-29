package map_interface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        // creating the Tree Map
        TreeMap<Integer, String> treeMap = new TreeMap<>(); // tight coupling - rarely used.
        Map<Integer, String> map = new TreeMap<>();  // loose coupling - always preferred.

        // add some elements
        map.put(4, "Ganning");
        map.put(2, "Joel");
        map.put(7, "Paul");
        map.put(3, "Kishore");
        map.put(1, "Mani");
        map.put(6, "Niranjan");
        map.put(5, "Harish");
        map.put(8, null);
        try {
            map.put(null, "Regan");  // will throw the exception while running (runtime)
        }
        catch (Exception e) {
            System.out.println("\nException: An Error Occurred! " +e.getMessage());
        }
        System.out.println("\nThe Tree Map is: \n" +map);

        // getting the elements
        System.out.println("\nThe value of the Key-8 is: \n" +map.get(8));
        System.out.println("\nThe value of the Key-3 is: \n" +map.get(3));
        System.out.println("\nThe value of the Key-9 is: \n" +map.get(9));   // not inserted so prints as null.

        // updating the elements
        map.put(7, "Virat");
        System.out.println("\nThe Tree Map after updating the key-7 is: \n" +map);
        map.put(9, "Goutham");  // will not replace anyone. Just add this new entry into the TreeMap
        System.out.println("\nThe Tree Map after updating the key-9 is: \n" +map);

        // removing the elements
        map.remove(5);
        System.out.println("\nThe Tree Map after removing the key-5 is: \n" +map);
        map.remove(3, "Dhoni");  // will not remove anything. because 3=Dhoni pair is not available
        System.out.println("\nThe Tree Map after removing the key-3 is: \n" +map);
        map.remove(7, "Virat");  // this will be removed because it matches the key-value pair in the Tree Map.
        System.out.println("\nThe Tree Map after removing the key-7 is: \n" +map);

        // checking for the contains keys and values
        System.out.println("\nIs the key-4 present in the Tree Map? \n" +map.containsKey(4));
        System.out.println("\nIs the key-8 present in the Tree Map? \n" +map.containsKey(8));
        System.out.println("\nIs the key-10 present in the Tree Map? \n" +map.containsKey(10));

        System.out.println("\nIs the value=virat present in the Tree Map? \n" +map.containsValue("Virat"));
        System.out.println("\nIs the value=Ganning present in the Tree Map? \n" +map.containsValue("Ganning"));
        System.out.println("\nIs the value=Rahul present in the Tree Map? \n" +map.containsValue("Rahul"));
        System.out.println("\nIs the value=ganning present in the Tree Map? \n" +map.containsValue("ganning"));  // case sensitive.

        // printing the keys alone
        System.out.println("\nThe Keys in the TreeMap is: ");
        for (Integer keys : map.keySet()) {
            System.out.print(keys + " ");
        }

        // printing the values alone
        System.out.println("\n\nThe Values in the TreeMap is: ");
        for (String values : map.values()) {
            System.out.print(values + " ");
        }

        // size
        System.out.println("\n\nThe Size of the TreeMap is: \n" +map.size());

        // check for empty
        System.out.println("\nIs the TreeMap is Empty? \n" +map.isEmpty());

        // SPECIAL METHODS IN THE TREEMAP - USES THE TIGHT COUPLING TO ACCESS THE SPECIFIC METHODS OF TREEMAP.
        treeMap.put(4, "Ganning");
        treeMap.put(2, "Joel");
        treeMap.put(7, "Paul");
        treeMap.put(3, "Kishore");
        treeMap.put(1, "Mani");
        treeMap.put(6, "Niranjan");
        treeMap.put(5, "Harish");

        // firstkey() and lastkey()
        System.out.println("\nThe First Key in the TreeMap is: \n" +treeMap.firstKey());     // first key will be returned
        System.out.println("\nThe Last Key in the TreeMap is: \n" +treeMap.lastKey());       // last key will be returned
        System.out.println("\nThe Last Entry in the TreeMap is: \n" +treeMap.lastEntry());   // last entry will be returned
        System.out.println("\nThe First Entry in the TreeMap is: \n" +treeMap.firstEntry()); // first entry will be returned

        // headMap(tokey)
        System.out.println("\nThe Entries less then the mentioned pair: \n" +treeMap.headMap(2)); // less than the entered key pair will be returned

        // tailMap(fromkey)
        System.out.println("\nThe Entries greater then or equal to the mentioned key is: \n" +treeMap.tailMap(5));  // greater entries will be returned

        // subMap(range)
        System.out.println("\nThe Entries between the range is: \n" +treeMap.subMap(2,5));  // greater than or equal to 2 to less than 5 entries will be returned

        // celingkey() and floorkey()
        System.out.println("\nThe ceiling key of the TreeMap is: \n" +treeMap.ceilingKey(3));
        System.out.println("\nThe floor key of the TreeMap is: \n" +treeMap.floorKey(3));

        // higherkey() and lowerkey()
        System.out.println("\nThe HighestKey from the mentioned key: \n" +treeMap.higherKey(5));
        System.out.println("\nThe Lowestkey of the TreeMap is: \n" +treeMap.lowerKey(3));

        // clearing the elements
        map.clear();
        System.out.println("\nThe TreeMap after clearing all the elements: \n" +map);
        treeMap.clear();
        System.out.println("\nThe TreeMap after clearing all the elements: \n" +treeMap);
    }
}
