/*
5. Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in the priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue.
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        //1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
        PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        System.out.println("Original Elements : "+colors);

        //2. iterate through all elements in the priority queue.
        System.out.print("Iterating : ");
        Iterator<String> it = colors.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        //3. add all the elements of a priority queue to another priority queue.
        PriorityQueue<String> colors2 = new PriorityQueue<>();
        colors2.addAll(colors);
        System.out.println("After Adding : "+colors2);

        //4. insert a given element into a priority queue.
        colors2.add("Green");
        System.out.println(colors2);

        //5. remove all the elements from a priority queue.
        colors2.clear();
        System.out.println("After Removing : "+colors2.size());

        //6. count the number of elements in a priority queue.
        System.out.println("Number of Elements : "+colors.size());

        //7. compare two priority queues.
        colors2.add("Red");
        colors2.add("Black");
        System.out.println("Comparing : "+colors.containsAll(colors2));

        //8. retrieve the first element of the priority queue.
        System.out.println("First Element : "+colors.peek());

        //9. retrieve and remove the first element.
        System.out.println("First Element : "+colors.poll());

        //10. convert a priority queue to an array containing all of the elements of the queue.
        String[] arr = colors.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
        

    }
}
