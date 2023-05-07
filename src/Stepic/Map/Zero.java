package Stepic.Map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Zero {
    public static void main(String[] args) {
        /*
         * HashMap<Key, Value>
         * - Keys are unique
         * - Uses a hash-table + list
         * LinkedHashMap<Key, Value>
         * - Keys are unique
         * - Keeps the keys in order of addition
         * TreeMap<Key, Value>
         * - Keys are unique
         * - Keeps its keys always sorted
         * - Uses a balanced search tree
         */
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();

        // Is it empty?
        System.out.println(map.isEmpty() ? "YES" : "NO");

        // Add an element
        map.put(1, "Ivan");
        map.put(2, "Anastasia");
        System.out.println(map); // {1=Ivan, 2=Anastasia}

        HashMap<Integer, String> temporary = new HashMap<>();
        temporary.put(3, "Valentina");
        temporary.put(4, "Boris");
        map.putAll(temporary);
        System.out.println(map); // {1=Ivan, 2=Anastasia, 3=Valentina, 4=Boris}

        // Add if there is no element with such index
        map.putIfAbsent(3, "Victoria");
        map.putIfAbsent(5, "Anna");
        System.out.println(map); // {1=Ivan, 2=Anastasia, 3=Valentina, 4=Boris, 5=Anna}

        // Size of the map
        System.out.println("Size: " + map.size()); // 5

        // Get an element with index
        System.out.println(map.get(2)); // Anastasia
        System.out.println(map.get(-1)); // null

        // Remove
        map.putIfAbsent(6, "Konstantin");
        System.out.println(map); // {1=Ivan, 2=Anastasia, 3=Valentina, 4=Boris, 5=Anna, 6=Konstantin}
        map.remove(4);
        System.out.println(map); // {1=Ivan, 2=Anastasia, 3=Valentina, 5=Anna, 6=Konstantin}

        // Replace
        map.replace(3, "Victoria");
        System.out.println(map); // {1=Ivan, 2=Anastasia, 3=Victoria, 5=Anna, 6=Konstantin}

        // Does it contain?
        System.out.println("Does it contain the key: " + map.containsKey(500)); // false
        System.out.println("Does it contain the value: " + map.containsValue("Ivan")); // true

        // Get all keys
        System.out.println("Keys: " + map.keySet()); // Keys: [1, 2, 3, 5, 6]

        // Get all values
        System.out.println("Values: " + map.values()); // Values: [Ivan, Anastasia, Victoria, Anna, Konstantin]

        // Get all elements
        System.out.println("Elements: " + map.entrySet()); // entrySet: [1=Ivan, 2=Anastasia, 3=Victoria, 5=Anna, 6=Konstantin]

        // Print with for-loop - Example 1
        for (int key : map.keySet()) {
            System.out.printf("%d - %s%n", key, map.get(key));
        }

        // Print with for-loop - Example 2
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.printf("Key[%d] => Value[%s]%n", entry.getKey(), entry.getValue());
        }

        // Print with an iterator - Example 3
        Set set = map.entrySet();
        Iterator iterator1 = set.iterator();

        while (iterator1.hasNext()) {
            Map.Entry mEntry = (Map.Entry) iterator1.next();
            System.out.printf("%s - %s%n", mEntry.getKey(), mEntry.getValue());
        }

        // Print with a Stream - Example 4
        map.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));

        // Create Map with a Stream
        List<String> names = Arrays.asList("Anastasia", "Irina", "Diana", "Anna", "Victoria");

        Map<Integer, String> theSecondMap = names
                .stream()
                .collect(Collectors.toMap(n -> names.indexOf(n) + 1, Function.identity()));
        theSecondMap.forEach((key, value) -> System.out.printf("Key[%d] => Value[%s]%n", key, value));
    }
}