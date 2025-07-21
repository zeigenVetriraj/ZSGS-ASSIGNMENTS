//2. Write a program in which, declare all data types like integer, double, float, long integer, character and byte data and print them.
public class Variables {
    
    public static void main(String[] args) {
        int intVariable = 10; // integer variable (4byte)
        double doubleVariable = 12.13; // double variable (8byte)
        float floatVariable = 45.12F; // float varible in the ending you shuld use 'f' or 'F' (4byte)
        long longVariable = 1234568L; // long variable (8byte)
        char charVariable = '#'; // charecter variable (2byte)
        byte byteVariable = 120; // byte variabel (1byte) -128 to 127
        
        System.out.println("Integer primitive variable (int): " + intVariable);
        System.out.println("Double primitive variable (double): " + doubleVariable);
        System.out.println("Float primitive variable (float): " + floatVariable);
        System.out.println("Long primitive variable (long): " + longVariable);
        System.out.println("Character primitive variable (char): " + charVariable);
        System.out.println("Byte primitive variable (byte): " + byteVariable);
    }
}