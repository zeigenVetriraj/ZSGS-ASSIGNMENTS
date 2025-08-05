import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/*
4. Write a Java program to,
a. create a new tree set, add some colors (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
i. Create a TreeSet that stores a set of numbers, find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set.
 */

public class TreeSetDemo {
    public static void main(String[] args) {

        //a. create a new tree set, add some colors (string) and print out the tree set.
        TreeSet<String> colors = new TreeSet<>(List.of("White", "Black", "Gray"));
        System.out.println(colors);

        //b. iterate through all elements in a tree set.
        System.out.print("Iterating : ");
        colors.forEach(x -> System.out.print("'"+x + "' "));
        System.out.println();

        //c. add all the elements of a specified tree set to another tree set.
        TreeSet<String> set = new TreeSet<>(colors);
        System.out.println(set);

        //d. create a reverse order view of the elements contained in a given tree set.
        System.out.print("Iterating Backwords : ");
        Iterator<String> it = set.descendingIterator();
        while(it.hasNext()) System.out.print("'"+it.next()+"' ");
        System.out.println();

        //e. get the first and last elements in a tree set.
        System.out.println("First : "+set.first());
        System.out.println("Last  : "+set.last());
        System.out.println(set);

        //f. clone a tree set list to another tree set.
        set =(TreeSet<String>) colors.clone();
        System.out.println(set);

        //g. get the number of elements in a tree set.
        System.out.println("Number of Elements : "+set.size());

        //h. compare two tree sets.
        System.out.println("Comparision : "+set.equals(colors));

        //i. Create a TreeSet that stores a set of numbers, find the numbers less than 7 in a tree set.
        TreeSet<Integer> nums = new TreeSet<>(List.of(20,15,8,4,3,6,8,9,10));
        System.out.print("Finding Less than 7 : ");
        nums.forEach(x ->{
            if(x<7) System.out.print(x + " ");
        });
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        //j. get the element in a tree set which is greater than or equal to the given element.
        System.out.println("Finding Grater than or equal to "+n +" : "+ nums.ceiling(n));

        //k. get the element in a tree set which is less than or equal to the given element.
        System.out.println("Finding Less than or equal to "+n +" : "+ nums.floor(n));

        //l. get the element in a tree set which is strictly greater than or equal to the given element.
        System.out.println("Finding Strictly grater : "+nums.higher(n));

        //m. get an element in a tree set which is strictly less than the given element.
        System.out.println("Finding Strictly Less : "+nums.lower(n));

        //n. retrieve and remove the first element of a tree set.
        System.out.println("Retriving First Element : "+nums.pollFirst());

        //o. retrieve and remove the last element of a tree set.
        System.out.println("Retriving Last Element : "+nums.pollLast());

        //p. remove a given element from a tree set.
        if(nums.remove(n)) System.out.println("The "+n+" was removed from the set.");
        else System.out.println("Thare is no such element.");
    }
}
