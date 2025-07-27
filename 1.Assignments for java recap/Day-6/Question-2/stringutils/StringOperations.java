package stringutils;

public class StringOperations {
    public String concatenate(String a, String b) {
        return a + b;
    }

    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public int getLength(String input) {
        return input.length();
    }
}
