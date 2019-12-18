package example_02_enum;

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {

       // Day.MONDAY=Day.FRIDAY; cant do because it is FINAL
        Day today = Day.SATURDAY;
        switch (today) {
            case SATURDAY:
                System.out.println("First day of the weekend - Saturday.");
                break;
            case SUNDAY:
                System.out.println("The last day of the weekend - Sunday.");
                break;
            default:
                System.out.println("The weekday - " + today);
        }

        // Also, you can compare instances of enum types using the operation ==
        if (today == Day.SATURDAY) {
            System.out.println("Finally, weekend!");
        }

    }
}