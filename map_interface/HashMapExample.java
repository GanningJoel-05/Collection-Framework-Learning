package map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        // creating a hash map
        HashMap<Integer, String> m = new HashMap<>(); // tight coupling - rarely used.
        Map<Integer, String> m1 = new HashMap<>();   // loose coupling - most preferred.

        // adding the elements
        m1.put(5, "Apple");
        m1.put(1, "Banana");
        m1.put(3, "Carrot");
        m1.put(2, "Dog");
        m1.put(4, "Elephant");
        m1.put(7, "France");
        m1.put(null, null);
        m1.put(6, null);    // this one will be added because, it has an unique key and values can be null for multiple keys, so it will be in the Map.
        m1.put(null, null); // only one null value for the Key is allowed, 2 keys can't be null. This pair will not be in the Map.
        System.out.println("\nThe HashMap is: \n" +m1);

        // getting the elements
        System.out.println("\nThe Value Present in the Key-3 is: \n" +m1.get(3)); // returns Carrot
        System.out.println("\nThe Value Present in the Key-6 is: \n" +m1.get(6)); // returns France
        System.out.println("\nThe Value Present in the Key-9 is: \n" +m1.get(9)); // returns null. because, key 9 doesn't exist.

        // updating the elements
        m1.put(7, "Grapes");  // will replace the already existing key's value with the new ones.
        System.out.println("\nThe HashMap after updating (or) over written value for key-7 is: \n" +m1);
        m1.put(3, "Onion");   // remember that, only values can be replaced or updated, keys cannot be replaced like we are doing for the values.
        System.out.println("\nThe HashMap after updating (or) over written value for key-3 is: \n" +m1);

        // removing the elements
        m1.remove(7);
        System.out.println("\nThe HashMap after removing the 7th key-value pair: \n" +m1);
        m1.remove(1, null);  // doesn't remove anything. because, this pair doesn't exist in the HashMap - Key correct, but it's value is wrong.
        System.out.println("\nThe HashMap after removing the 1st key-value pair: \n" +m1);
        m1.remove(null, null); // This pair will be removed now. because, it is already present in the HashMap - Key and it's pair are correct.
        System.out.println("\nThe HashMap after removing the null key-value pair: \n" +m1);
        m1.remove(9); // won't be removed. because, the key value doesn't exist in the HashMap.
        System.out.println("\nThe HashMap after removing the 9th key-value pair: \n" +m1);

        // checking for the contain key and values
        System.out.println("\nIs the 3rd key is present in the Hashmap? \n" +m1.containsKey(3));
        System.out.println("\nIs the 5th key is present in the Hashmap? \n" +m1.containsKey(5));
        System.out.println("\nIs the 9th key is present in the Hashmap? \n" +m1.containsKey(9));
        System.out.println("\nIs the 8th key is present in the Hashmap? \n" +m1.containsKey(8));

        System.out.println("\nIs the value 'Apple' is present in the Hashmap? \n" +m1.containsValue("Apple"));  // Returns true - Case Sensitive
        System.out.println("\nIs the value 'APPLE' is present in the Hashmap? \n" +m1.containsValue("APPLE"));  // Returns false - Case Sensitive
        System.out.println("\nIs the value 'France' is present in the Hashmap? \n" +m1.containsValue("France"));// Removed the Element before - returns false here.
        System.out.println("\nIs the value 'Joel' is present in the Hashmap? \n" +m1.containsValue("Joel"));    // Returns false - Value doesn't exist.

        // Printing all keys and values and key-value pairs
        System.out.println("\nThe Entire keys in the Hashmap are: \n" +m1.keySet()); // prints keys alone
        System.out.println("\nThe Entire Values in the HashMap are: \n" +m1.values()); // prints all the values - In collections format
        System.out.println("\nThe Entire Key-Value pairs in the HashMap are: \n" +m1.entrySet()); // prints all the values - In collections format

        // Iterating the elements - not possible with the combination of both the keys and values together. we can do it separately for keys and values
        System.out.println("\nThe Keys in the HashMap using the enhanced for loop: ");
        for (Integer num : m1.keySet()) {  // iterating keys using the enhanced for loop
            System.out.print(num + " ");
        }

        System.out.println("\n\nThe Values in the HashMap using the enhanced for loop: ");
        for (String str : m1.values()) {   // iterating values using the enhanced for loop
            System.out.print(str + " ");
        }

        // HashMap Size
        System.out.println("\n\nThe size of the HashMap is: \n" +m1.size());

        // Check for the empty HashMap
        System.out.println("\nIs the HashMap is Empty? \n" +m1.isEmpty());

        // A way of adding the new pair which avoids the duplicates as well
        m1.putIfAbsent(9, "Paul");
        System.out.println("\nThe HashMap after adding the new pair: \n" +m1);

        // clearing the HashMap
        m1.clear();
        System.out.println("\nThe HashMap after clearing all the elements: \n" +m1);

//        Superb question buddy 🔥🧡 — you caught a **very fine detail** in the output format of Java Collections. Let’s clarify this step by step:
//
//        ---
//
//### 🔹 1. Why **curly braces `{}`** for `Map` output?
//
//* When you print a **Map** (like `HashMap`, `TreeMap`, `LinkedHashMap`), Java internally calls its `toString()` method.
//                * The `toString()` method of `Map` is **different** from `List`, `Set`, or `Queue`.
//
//👉 **For `List`, `Set`, `Queue`:**
//
//* They are collections of **single elements**, so `toString()` shows elements in **square brackets `[ ]`**.
//        Example:
//
//  ```java
//        List<String> list = List.of("A", "B", "C");
//        System.out.println(list);
//  ```
//
//        Output:
//
//  ```
//  [A, B, C]
//  ```
//
//👉 **For `Map`:**
//
//* It is a collection of **key-value pairs**.
//* So `toString()` is implemented to display entries inside **curly braces `{ }`**.
//* Each entry looks like `key=value`.
//        Example:
//
//  ```java
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Apple");
//        map.put(2, "Banana");
//        System.out.println(map);
//  ```
//
//        Output:
//
//  ```
//        {1=Apple, 2=Banana}
//  ```
//
//📌 **Conclusion:**
//
//* Square brackets `[]` → Used for single-element collections (`List`, `Set`, `Queue`).
//                * Curly braces `{}` → Used for key-value collections (`Map`).
//
//                ---
//
//### 🔹 2. Why `=` symbol between Key and Value?
//
//                Yes, buddy ✅ You got it right. The `=` symbol is used to represent the **mapping between a Key and a Value**.
//
//* Example:
//
//  ```
//        1=Apple
//  ```
//
//        means → Key `1` is **mapped to** Value `"Apple"`.
//* Internally, Java represents each entry as an **`Entry<K, V>` object**, and its `toString()` returns `"key=value"` format.
//
//                That’s why in your output:
//
//```
//        {1=Apple, 2=Banana, 3=Carrot, 4=Dog, 5=Elephant, 6=France}
//```
//
//        each pair follows the `"key=value"` style inside `{ }`.
//
//        ---
//
//✅ So:
//
//* `{}` → denotes a `Map` (key-value store).
//* `=` → denotes mapping between key and value.
//* `[]` → denotes a collection of just values/elements (like `List`, `Set`, `Queue`).
//
//                ---
//
//👉 Quick experiment (you can try in your code):
//
//```java
//        System.out.println(m1.keySet());     // prints only keys -> [1, 2, 3, 4, 5, 6]
//        System.out.println(m1.values());    // prints only values -> [Apple, Banana, Carrot, Dog, Elephant, France]
//        System.out.println(m1.entrySet());  // prints entries -> [1=Apple, 2=Banana, 3=Carrot, 4=Dog, 5=Elephant, 6=France]
//```
//
//        Notice how:
//
//* Keys & Values use `[]` (because they’re simple collections).
//* Entries use `{}` when shown through the Map, but `[]` when shown as `Set<Entry>`.
//
//        ---
//
//🧡 Does this clear your confusion, my friend?
//                Would you like me to also **draw a mental diagram** showing how `HashMap` stores keys and values internally (like buckets and mappings)?

    }
}
