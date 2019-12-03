import java.util.Scanner;

//Bicycle Class
public class Bicycle {

    private String name;        //Bicycle Name
    private int currentSpeed;   //Bicycle Current Speed
    private int wheelDiameter;  //Bicycle Wheel Diameter
    private int maxSpeed;       //Bicycle Max Speed
    private String direction;   //Bicycle Traveling Direction

    //Bicycle Name Getter
    public String getName() {
        return name;
    }

    //Bicycle Name Setter
    public void setName(String name) {
        this.name = name;
    }

    //Bicycle Wheel Diameter Getter
    public int getWheelDiameter() {
        return wheelDiameter;
    }

    //Bicycle Wheel Diameter Setter
    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
        if (wheelDiameter < 24) {
            maxSpeed = 25;
            System.out.println("Max speed for " + wheelDiameter + "\" bicycle is " + maxSpeed + " km/h");
        } else if (wheelDiameter < 27) {
            maxSpeed = 40;
            System.out.println("Max speed for " + wheelDiameter + "\" bicycle is " + maxSpeed + " km/h");
        } else if (wheelDiameter <= 29) {
            maxSpeed = 50;
            System.out.println("Max speed for " + wheelDiameter + "\" bicycle is " + maxSpeed + " km/h");
        } else {
            System.out.println("wrong wheel diameter");
        }
    }

    //Bicycle Current Speed Getter
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    //Bicycle Current Speed Setter
    public void setCurrentSpeed(int currentSpeed) {
        if (currentSpeed > maxSpeed) {
            System.out.println("Current speed should be less then max speed!");
        }
        this.currentSpeed = currentSpeed;
    }

    //Bicycle Travel Direction Getter
    public String getDirection() {
        return direction;
    }

    //Bicycle Travel Direction Setter
    public void setDirection(String direction) {
        this.direction = direction;
    }

    //This method stop the bicycle
    public void pressBrake() throws InterruptedException {
        if (currentSpeed != 0) {
            System.out.print("Current Speed: ");
            for (int i = currentSpeed; i >= 0; i--) {
                Thread.sleep(150);
                System.out.print(i + "km/h, ");
            }
            System.out.println("\nBicycle stopped!");
        } else System.out.println("Stop");
    }

    //This method Move Bicycle
    public void move() {
        if (currentSpeed != 0) {
            System.out.println("You are traveling in the direction " + direction + ", your speed is: " + currentSpeed + "km/h");
        }
    }

    //This method accelerate the bicycle
    public void accelerate() throws InterruptedException {
        System.out.println("Accelerate on speed: " + currentSpeed + "km/h");
        if (currentSpeed < maxSpeed) {
            System.out.print("Current speed: ");
            do {
                currentSpeed += 1;
                Thread.sleep(250);
                System.out.print(currentSpeed + "km/h, ");
            } while (currentSpeed < maxSpeed);
            System.out.println("\nYou have reached your max speed!");
        }
    }

    //This method give you information about Bicycle, Max Speed, Current Speed and Travel Direction.
    public void showInfo() {
        System.out.println("Bicycle Name: " + getName());
        System.out.println("Bicycle Wheel Diameter: " + getWheelDiameter() + "\"");
        System.out.println("Bicycle Max Speed: " + maxSpeed + "km/h");
        System.out.println("Bicycle Current Speed: " + getCurrentSpeed() + "km/h");
        System.out.println("Bicycle Travel Direction: " + getDirection());
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Bicycle bicycle = new Bicycle();

        System.out.print("Please give your bicycle name: ");
        bicycle.setName(scanner.next());

        System.out.print("Please give your bicycle wheel diameter (min diameter is 20\", max diameter is 29\"): ");
        bicycle.setWheelDiameter(scanner.nextInt());

        System.out.print("Please give your bicycle travel direction (W-West, N-North, E-East, S-South): ");
        bicycle.setDirection(scanner.next());

        System.out.print("Please give your bicycle current speed: ");
        bicycle.setCurrentSpeed(scanner.nextInt());

        System.out.println("\n-----------------------------------------------------------");
        bicycle.showInfo();
        System.out.println("\n-----------------------------------------------------------");
        bicycle.move();
        System.out.println("\n-----------------------------------------------------------");
        bicycle.pressBrake();
        System.out.println("\n-----------------------------------------------------------");
        bicycle.accelerate();

    }
}
