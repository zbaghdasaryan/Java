package example_12_exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            throw null;
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
