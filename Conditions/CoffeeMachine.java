import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        System.out.println("Sizes of coffee cups: 1 = Small, 2 = Medium, 3 = Large");
        System.out.print("Please make your choice: ");

        Scanner scanner = new Scanner(System.in);
        int coffeeSize = scanner.nextInt();

        int cost = 0;

        switch (coffeeSize) {
            case 3:
                cost += 50;
            case 2:
                cost += 50;
            case 1:
                cost += 100;
                break;
            default:
                System.out.println("Wrong choice. Please select 1, 2, or 3.");
                break;
        }
        if (cost != 0) {
            System.out.println("Cost is a" + cost + " dram.\nThank you!");
        } else {
            System.out.print("Please select again.");
        }
    }
}

