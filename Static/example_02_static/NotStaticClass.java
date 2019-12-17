package example_02_static;

public class NotStaticClass {
    private int Id;


    public NotStaticClass(int Id) {

        this.Id = Id;
    }

    public static void method() {

        //System.out.println("Instance.Id = {0}", Id);

        System.out.println("Non-static field 'Id' cannot be referenced from a static context.");
    }
}
