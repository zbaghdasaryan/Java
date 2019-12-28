package example_02_exceptions;

public class Main {
    public static void main(String[] args) {
        Exception ex = new Exception("My Exception");

        try {
            throw ex;
        } catch (Exception e) {
            System.out.println("Exception handling");
            System.out.println(e.getMessage());
        }
    }
}
