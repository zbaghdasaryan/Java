package example_07_exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 1, n = 2;

        try {
            System.out.println("We are trying to divide by zero.");
            System.out.println("a / (2 - n) = " + (a / (2 - n)));
        } catch (Exception e) {
            System.out.println("Exception handling");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Block finally.");
        }

        System.out.println("End of code");
    }
}
