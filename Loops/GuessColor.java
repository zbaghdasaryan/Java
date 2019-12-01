import java.util.Scanner;

public class GuessColor {
    public static void main(String[] args) {

        System.out.println("Guess the color in five attempts.");
        System.out.println("To exit the program, enter - exit.");

        final int MAX_ATTEMPT = 5;  //Allowed number of attempts.
        int attempt = 0;            //Attempt Counter.
        String color = "red";       //The intended color.
        Scanner in = new Scanner(System.in);

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("attempt " + attempt);
            String value = in.next();
            if (value.equals("exit")) {
                break;
            }
            if (!value.equals(color)) {
                continue;
            }
            System.out.println("Congratulations, you guessed it at " + attempt + "attempt");
        }
        System.out.println("End of the game");
    }
}
