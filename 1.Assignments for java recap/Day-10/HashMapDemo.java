import java.util.HashMap;
import java.util.Map;

/*
7. Write a Java program to,
1. associate the specified value with the specified key in a HashMap.
2. count the number of key-value (size) mappings in a map.
3. copy all of the mappings from the specified map to another map.
4. remove all of the mappings from a map.
5. check whether a map contains key-value mappings (empty) or not.
6. get a shallow copy of a HashMap instance.
7. test if a map contains a mapping for the specified key.
8. test if a map contains a mapping for the specified value.
9. create a set view of the mappings contained in a map.
10. get the value of a specified key in a map.
 */
public class HashMapDemo {
    public static void main(String[] args) {

        //1. associate the specified value with the specified key in a HashMap.
        HashMap<Integer, String> map = new HashMap<>(Map.of(1,"One",2,"Two",3,"Three"));
        System.out.println("Original : "+map);

        //2. count the number of key-value (size) mappings in a map.
        System.out.println("Number of Key's : "+map.size());

        //3. copy all of the mappings from the specified map to another map.
        HashMap<Integer, String> copyMap = new HashMap<>(map);
        System.out.println("Copyed Map : "+copyMap);

        //4. remove all of the mappings from a map.
        System.out.print("Before : "+copyMap.size());
        copyMap.clear();
        System.out.println(" | After : "+copyMap.size());

        //5. check whether a map contains key-value mappings (empty) or not.
        System.out.println("Contains any thing : "+ !copyMap.isEmpty());

        //6. get a shallow copy of a HashMap instance.
        HashMap<Integer, String> cloneMap = (HashMap<Integer, String>) map.clone();
        System.out.println(cloneMap);

        //7. test if a map contains a mapping for the specified key.
        System.out.println("Containing Key : "+map.containsKey(2));

        //8. test if a map contains a mapping for the specified value.
        System.out.println("Containing Value : "+map.containsValue("Two"));

        //9. create a set view of the mappings contained in a map.
        System.out.println("Set View Map : "+map.entrySet());

        //10. get the value of a specified key in a map.
        System.out.println("Value of 3 : "+map.get(3));
    }
}
