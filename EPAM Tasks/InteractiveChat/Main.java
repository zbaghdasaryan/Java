package example_01_exceptions;

public class Main {
    public static void main(String[] args) {

        int a = 1, n = 1;

        try {
            a = a / (2 - n);
            System.out.println("a = " + a);
        } catch (Exception e) {
            System.out.println("Exception handling");
            System.out.println(e.getMessage());
        }
    }
}
