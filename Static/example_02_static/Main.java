package example_02_static;

//Non-static field 'Id' cannot be referenced from a static context
public class Main {
    public static void main(String[] args) {

        NotStaticClass instance = new NotStaticClass(1);
        instance.method();
    }
}
