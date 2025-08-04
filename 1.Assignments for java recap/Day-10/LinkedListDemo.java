import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
2. Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(10,20,30,40,50));

        //a. append the specified element to the end of a linked list.
        list.addLast(60);
        System.out.println("After added '60' in last index : "+list);

        //b. iterate through all elements in a linked list.
        System.out.print("Iterating Every Element : ");
        list.forEach(n -> System.out.print(n+" "));
        System.out.println();

        //c. iterate through all elements in a linked list starting at the specified position.
        System.out.print("Iterating from index '2' : ");
        for(int i=2; i<list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //d. iterate a linked list in reverse order.
        System.out.print("Iterating Backwords : ");
        Iterator<Integer> it = list.descendingIterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        //e. insert the specified element at the specified position in the linked list.
        list.add(2,25);
        System.out.println("After adding 25 : "+list);

        //f. insert elements into the linked list at the first and last position.
        list.addFirst(5);
        list.addLast(70);
        System.out.println("After Adding in front and back : "+list);

        //g. insert the specified element at the front of a linked list.
        list.addFirst(1);
        System.out.println("Added : "+list);

        //h. insert the specified element at the end of a linked list.
        list.addLast(75);
        System.out.println("Added : "+list);

        //i. insert some elements at the specified position into a linked list.
        list.addAll(4,new LinkedList<>(List.of(21,22,23,24)));
        System.out.println("After adding : "+list);

        //j. get the first and last occurrence of the specified elements in a linked list
        System.out.println("First : "+list.getFirst()+"\nLast : "+list.getLast());
    }
}
