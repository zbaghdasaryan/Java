public class DoWhileContinue {
    public static void main(String[] args) {
        int counter = 0;

        do {
            counter++;
            System.out.println("counter " + counter);

            if (true) continue;
            System.out.println("This line will not execute.");

        } while (counter < 10);

        System.out.println("Product " + counter + " iteration");
    }
}
