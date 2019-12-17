package example_03_static;

public class Main {
    public static void main(String[] args) {
        NotStaticClass instance =new NotStaticClass();

        instance.NotStaticMethod();
        NotStaticClass.StaticMethod();
    }
}
