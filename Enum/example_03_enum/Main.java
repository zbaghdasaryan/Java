package example_03_enum;

enum Company {
    // Instances.
    EPAM(800), SOFTCONSTRUCT(1200), EGS(2000);

    int value;

    // Constructor can be only private.
    Company(int value) {

        this.value = value;
    }

    public int getValue() {

        return value;
    }
}

public class Main {
    public static void main(String[] args) {

        Company myComp = Company.EPAM;
        System.out.println("I work in the company " + myComp + " and my salary is  " + myComp.getValue() + "$ per month.");
    }
}