public class DoWhile {
    public static void main(String[] args) {
        int counter = 0;

        do {
            counter++;
            System.out.println("Counter " + counter);
        } while (counter < 3);

        System.out.println("Product "+ counter + " iteration");
    }
}
