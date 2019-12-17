package example_03_static;

public class NotStaticClass {
    public NotStaticClass() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("static block");
    }

    public static void StaticMethod(){
        System.out.println("Static Method");
    }
    public void NotStaticMethod()
    {
        System.out.println("Not static Method");
    }
}
