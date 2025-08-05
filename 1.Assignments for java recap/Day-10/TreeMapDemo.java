import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/*
6. Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map.
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        //1. associate the specified value with the specified key in a Tree Map.
        TreeMap<Integer, String> map = new TreeMap<>(Map.of(1,"One",2,"Two",3,"Three"));
        map.put(4,"Four");
        System.out.println(map);

        //2. copy a Tree Map content to another Tree Map.
        TreeMap<Integer, String> map1 = new TreeMap<>(map);
        System.out.println(map1);

        //3. search a key in a Tree Map.
        System.out.println("Key : "+map.containsKey(3));

        //4. search a value in a Tree Map.
        System.out.println("Value : "+map.containsValue("One"));

        //5. get all keys from the given a Tree Map.
        System.out.print("All Key's : ");
        map.forEach((x,y) -> System.out.print(x+" "));
        System.out.println();

        //6. delete all elements from a given Tree Map.
        System.out.print("Before : "+map1.size());
        map1.clear();
        System.out.println(" After : "+map1.size());

        //7. sort keys in Tree Map by using comparator.
        TreeMap<Integer, String> descMap = new TreeMap<>(Comparator.reverseOrder());
        descMap.putAll(map);
        System.out.println(descMap);

        //8. get a key-value mapping associated with the greatest key and the least key in a map.
        System.out.println("Least Entry : "+map.firstEntry());
        System.out.println("Greatest Entry : "+map.lastEntry());

        //9. get the first (lowest) key and the last (highest) key currently in a map.
        System.out.println("Lowest : "+map.firstKey());
        System.out.println("Highest : "+map.lastEntry());

        //10. get a reverse order view of the keys contained in a given map.
        System.out.println("Reverse Order Key : "+map.descendingKeySet());
        System.out.println("Reverse Order Value : "+map.descendingMap());

    }
}
