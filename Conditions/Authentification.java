import java.util.Scanner;

public class Authentification {
    public static void main(String[] args) {
        String login = "Student";
        String password = "Aa!23456789";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter login: ");

        String scannerLogin = scanner.next();

        if (login.equals(scannerLogin)) {
            System.out.print("Enter password: ");
            String scannerPassword = scanner.next();
            if (password.equals(scannerPassword)) {
                System.out.println("Hi " + scannerLogin + " you are logged in");
            } else {
                System.out.println("You entered an incorrect password!");
            }
        } else {
            System.out.println("You entered an incorrect login!");
        }
    }
}

