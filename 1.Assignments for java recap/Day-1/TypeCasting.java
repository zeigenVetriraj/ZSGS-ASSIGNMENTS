
//6. Write a program that illustrate the Explicit type casting?
public class TypeCasting {
    public static void main(String[] args) {
        double val = (double) 12 / 5; // when dividing 2 int's if the output has desimal value we have to consider
        System.out.println("Explicitly Type casted (int to double): " + val);

        // double to int explicit type casting
        double d = 9.87;
        int i = (int) d; // fractional part lost
        System.out.println("Explicitly Type casted (double to int): " + i);

        // Valid casting from char to int
        char ch = 'A';
        int chVal = (int) ch; // give the ASCI value fo 'A'
        System.out.println("Explicitly Type casted (char to int): " + chVal);

        // Reference type casting: upcasting and safe downcasting
        Animal animal = new Dog(); // Upcasting (implicit)
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Downcasting (explicit)
            System.out.println("Successfully downcasted Animal to Dog.");
        }

        // int to byte — causes overflow
        int bigNumber = 130;
        byte b = (byte) bigNumber;  // -126 due to overflow
        System.out.println("Explicitly Type casted (int to byte with overflow): " + b);
    }
}

class Animal {
    // statements
}
class Dog extends Animal {
    // statements
}