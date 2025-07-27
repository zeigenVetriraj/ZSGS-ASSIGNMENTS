import arithmetic.Operations;
import stringutils.StringOperations;

/*
2. Create a Java application that demonstrates the use of user-defined packages by organising classes based on their functionality:
--- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods.
*/

public class Main {
    public static void main(String[] args) {
        // Arithmetic operations
        Operations op = new Operations();
        int a = 20, b = 5;

        System.out.println("Addition: " + op.add(a, b));
        System.out.println("Subtraction: " + op.subtract(a, b));
        System.out.println("Multiplication: " + op.multiply(a, b));
        System.out.println("Division: " + op.divide(a, b));
        System.out.println("Modulo: " + op.modulo(a, b));

        // String operations
        StringOperations strOp = new StringOperations();
        String s1 = "Hello";
        String s2 = "World";

        System.out.println("Concatenation: " + strOp.concatenate(s1, s2));
        System.out.println("Reverse: " + strOp.reverse(s1));
        System.out.println("Length: " + strOp.getLength(s1));
    }
}

