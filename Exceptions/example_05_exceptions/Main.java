package example_05_exceptions;

//Для создания пользовательского исключения, требуется наследование от Exception.

class UserException extends Exception {
    public void method() {
        System.out.println("My Exception!");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException e) {
            System.out.println("Exception handling");
            e.method();
        }
    }
}
