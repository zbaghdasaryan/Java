package example_01_enum;

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {

        Day dayToday=Day.MONDAY;
        System.out.println("Today is: "+dayToday);
    }
}
