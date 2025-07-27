import java.util.Scanner;

/*
7. Design a calculator application using Java Inheritance.
‌
Create the following class hierarchy:
‌
--->BasicCalculator (Base class):
Implement at least three basic arithmetic methods, such as:
‌
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
‌
--->AdvancedCalculator (Inherits from BasicCalculator):
Add 3 to 4 advanced mathematical operations, such as:
‌
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
‌
--->ScientificCalculator (Inherits from AdvancedCalculator):
Add scientific functions, such as:
‌
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations. 
*/

public class Calculator {
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Divide");
            System.out.println("4. Multiply");
            System.out.println("5. Power");
            System.out.println("6. Modulus");
            System.out.println("7. Square Root");
            System.out.println("8. Sine");
            System.out.println("9. Cosine");
            System.out.println("10. Logarithm");
            System.out.println("11. Exponential");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
					System.out.println("--------------------------------------------------");
                    System.out.print("Enter a: ");
                    int a1 = sc.nextInt();
                    System.out.print("Enter b: ");
                    int b1 = sc.nextInt();
                    System.out.println("Result: " + calc.add(a1, b1));
					System.out.println("--------------------------------------------------");
                    break;
                case 2:
					System.out.println("--------------------------------------------------");
                    System.out.print("Enter a: ");
                    int a2 = sc.nextInt();
                    System.out.print("Enter b: ");
                    int b2 = sc.nextInt();
                    System.out.println("Result: " + calc.subtract(a2, b2));
					System.out.println("--------------------------------------------------");
                    break;
                case 3:
					System.out.println("--------------------------------------------------");
                    System.out.print("Enter a: ");
                    int a3 = sc.nextInt();
                    System.out.print("Enter b: ");
                    int b3 = sc.nextInt();
                    System.out.println("Result: " + calc.divide(a3, b3));
					System.out.println("--------------------------------------------------");
                    break;
                case 4:
					System.out.println("--------------------------------------------------");
                    System.out.print("Enter a: ");
                    int a4 = sc.nextInt();
                    System.out.print("Enter b: ");
                    int b4 = sc.nextInt();
                    System.out.println("Result: " + calc.multiply(a4, b4));
					System.out.println("--------------------------------------------------");
                    break;
                case 5:
					System.out.println("--------------------------------------------------");
                    System.out.print("Enter base: ");
                    int base = sc.nextInt();
                    System.out.println("Enter exponent: ");
                    int exp = sc.nextInt();
                    System.out.println("Result: " + calc.power(base, exp));
					System.out.println("--------------------------------------------------");
                    break;
                case 6:
					System.out.println("--------------------------------------------------");
                    System.out.print("Enter a: ");
                    int a6 = sc.nextInt();
                    System.out.print("Enter b: ");
                    int b6 = sc.nextInt();
                    System.out.println("Result: " + calc.modulus(a6, b6));
					System.out.println("--------------------------------------------------");
                    break;
                case 7:
					System.out.println("--------------------------------------------------");
                    System.out.print("Enter number: ");
                    double sq = sc.nextDouble();
                    System.out.println("Result: " + calc.squareRoot(sq));
					System.out.println("--------------------------------------------------");
                    break;
                case 8:
					System.out.println("--------------------------------------------------");
                    System.out.print("Enter angle (degrees): ");
                    double angle1 = sc.nextDouble();
                    System.out.println("Result: " + calc.sin(angle1));
					System.out.println("--------------------------------------------------");
                    break;
                case 9:
					System.out.println("--------------------------------------------------");
                    System.out.print("Enter angle (degrees): ");
                    double angle2 = sc.nextDouble();
                    System.out.println("Result: " + calc.cos(angle2));
					System.out.println("--------------------------------------------------");
                    break;
                case 10:
					System.out.println("--------------------------------------------------");
                    System.out.print("Enter value: ");
                    double val1 = sc.nextDouble();
                    System.out.println("Result: " + calc.log(val1));
					System.out.println("--------------------------------------------------");
                    break;
                case 11:
					System.out.println("--------------------------------------------------");
                    System.out.print("Enter value: ");
                    double val2 = sc.nextDouble();
                    System.out.println("Result: " + calc.exp(val2));
					System.out.println("--------------------------------------------------");
                    break;
                case 0:
					System.out.println("--------------------------------------------------");
                    System.out.println("Exiting... Thank you!");
					System.out.println("--------------------------------------------------");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}

// BasicCalculator
class BasicCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Can't divide by 0");
            return 0;
        }
        return a / b;
    }
}

// AdvancedCalculator
class AdvancedCalculator extends BasicCalculator {
    public int power(int base, int exponent) {
        int res = 1;
        for (int i = 0; i < exponent; i++) {
            res *= base;
        }
        return res;
    }

    public int modulus(int a, int b) {
        if (b == 0) {
            System.out.println("Can't perform modulus operation with 0");
            return 0;
        }
        return a % b;
    }

    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
}

// ScientificCalculator
class ScientificCalculator extends AdvancedCalculator {
    public double sin(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    public double cos(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    public double log(double value) {
        if (value <= 0) {
            System.out.println("Logarithm undefined for non-positive numbers.");
            return 0;
        }
        return Math.log(value);
    }

    public double exp(double value) {
        return Math.exp(value);
    }
}



