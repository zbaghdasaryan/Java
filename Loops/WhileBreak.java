//Loop construction - while. (with early exit from the cycle - break)

public class WhileBreak {
    public static void main(String[] args) {

        int counter=0;
        while(counter<3){

            counter++;
            System.out.println("Counter " + counter);

            if(true)
                break;
            System.out.println("This line will not execute.");
        }
        System.out.println("Product "+ counter + " iteration");

    }
}
