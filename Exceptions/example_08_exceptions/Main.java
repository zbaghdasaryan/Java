package example_08_exceptions;

// Для создания пользовательского исключения, требуется наследование от System.Exception.

class UserException extends Exception {
    public void Method() {

        System.out.println("My Exception!");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException userException) {
            System.out.println("Exception handling 1:");
            userException.Method();

            try {
                throw userException;
            } catch (UserException exception) {
                System.out.println("Exception handling 2:");
                exception.Method();
            }
        } finally {
            System.out.println("Block finally");
        }

        System.out.println("End of code");
    }
}
