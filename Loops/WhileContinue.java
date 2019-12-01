public class WhileContinue {
    public static void main(String[] args) {
        int counter=0;

        while(counter<3){
            counter++;
            System.out.println("Counter " + counter);

            if(true)
                continue;
            System.out.println("This line will not execute.");
        }
        System.out.println("Product "+ counter + " iteration");
    }
}
