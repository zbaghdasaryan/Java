import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity: ");

        int quantity = scanner.nextInt();
        int price = 100;
        float discount = 0.75f;
        double cost;

        cost = quantity > 10 ? price * discount * quantity : price * quantity;
        System.out.println("The total cost of the goods is " + cost);
    }
}
