//Loop construction - while

public class While {
    public static void main(String[] args) {
        int counter=0;
        while (counter < 10) {
            counter++;
            System.out.println("Counter " + counter);
        }
        System.out.println("Produced " + counter + " iterations.");
    }
}