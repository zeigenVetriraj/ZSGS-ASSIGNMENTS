
//1. Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?
public class Scope {
    final double PI = 3.14159;         // Final instance variable
    static String place = "Alangulam"; // Static variable
    String answer = "Yes";             // Instance variable

    public static void main(String[] args) {
        int x = 10; // Local variable

        // Block scope
        {
            int y = 11; // Block variable
            System.out.println("Sum of local and block variable (x + y): " + (x + y));
        }

        // Accessing static variable directly
        System.out.println("Static variable (place): " + place);

        // Accessing instance and final variable via object
        Question1 obj = new Question1();
        System.out.println("Final variable (PI): " + obj.PI);
        System.out.println("Instance variable (answer): " + obj.answer);
    }
}