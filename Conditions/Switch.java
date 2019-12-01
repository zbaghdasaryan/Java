import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.print("Enter the day number of the week 1, 2, 3, 4, 5, 6 or 7: ");
        Scanner scanner = new Scanner(System.in);
        int numberDay = scanner.nextInt();
        switch (numberDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You entered a nonexistent day of the week");
        }
        switch (numberDay) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("This day of the week is a working day");
                break;
            case 6:
            case 7:
                System.out.println("This day of the week is a weekend");
                break;
            default:
                break;
        }

    }
}
