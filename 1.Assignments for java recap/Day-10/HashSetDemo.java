import java.util.*;

/*
3. Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(List.of(10,20,30));

        //a. append the specified element to the end of a hash set.
        set.add(40);

        //b. iterate through all elements in a hash list.
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) System.out.print(it.next()+" ");
        System.out.println();

        //c. get the number of elements in a hash set.
        System.out.println("Number of Elements : "+ set.size());

        //d. empty the hash set.
        set.clear();
        System.out.println("Number of Elements : "+ set.size());

        //e. test a hash set is empty or not.
        if(set.isEmpty()) System.out.println("It's Empty");
        else System.out.println("It's Not Empty");

        //f. clone a hash set to another hash set.
        HashSet<Integer> set1 = new HashSet<>(List.of(10,20,30));
        HashSet<Integer> set2 = (HashSet<Integer>) set1.clone();
        System.out.println(set2);

        //g. convert a hash set to an array.
        Integer[] arr = set1.toArray(new Integer[0]);

        //h. convert a hash set to a tree set.
        TreeSet<Integer> treeSet = new TreeSet<>(set1);
        
        //i. convert a hash set to a List/ArrayList.
        ArrayList<Integer> list = new ArrayList<>(set1);
        
        //j. compare two hash set.
        System.out.println("Comparing 2 sets : "+set1.equals(set2));

    }
}
