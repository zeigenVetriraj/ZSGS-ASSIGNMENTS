import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

/*
1. Write a Java program
a. to create a new array list, add some colors (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list.
*/
public class ArrayListDemo {
    public static void main(String[] args) {
        //a. to create a new array list, add some colors (string) and print out the collection.
        ArrayList<String> colors = new ArrayList<>(List.of("Red","Blue","Yellow"));
        System.out.println("Original List: " +colors);

        //b. to iterate through all elements in an array list.
        System.out.print("Iterating: ");
        Iterator<String> it = colors.iterator();
        while (it.hasNext()) System.out.print(it.next()+" ");
        System.out.println();

        //c. to insert an element into the array list at the first position.
        colors.add(0,"Green");
        System.out.println("After Insertion at 0: " +colors);

        //d. to retrieve an element (at a specified index) from a given array list.
        System.out.println("Element at index 2: " +colors.get(2));

        //e. to update specific array element by given element.
        int index = colors.indexOf("Red");
        colors.set(index,"Orange");
        System.out.println("After Update: " +colors);

        //f. to remove the third element from an array list.
        colors.remove(3);
        System.out.println("After Removing 3rd element: " +colors);

        //g. to search an element in an array list.
        System.out.println("Contains 'Blue' : " + colors.contains("Blue"));

        //h. to sort a given array list.
        Collections.sort(colors);
        System.out.println("Sorted List: " +colors);

        //i. to copy one array list into another.
        ArrayList<String> addColor = new ArrayList<>(List.of("Wood","SkyBlue"));
        colors.addAll(addColor);
        System.out.println("After Copy: " + colors);

        //j. to shuffle elements in an array list.
        Collections.shuffle(colors);
        System.out.println("After Shuffle : "+colors);
    }
}
