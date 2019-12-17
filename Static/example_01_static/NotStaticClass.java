package example_01_static;

public class NotStaticClass {

    private int Id;
    public static int field;

    // Constructor.


    public NotStaticClass(int id) {
        Id = id;
    }

    public void method() {
        System.out.println("Instance"+Id+".field = "+ field);
    }
}
