package example_01_static;

//Static members in non-static classes.

public class Main {

    public static void main(String[] args) {
        NotStaticClass instance1 = new NotStaticClass(1);
        NotStaticClass instance2 = new NotStaticClass(2);

        instance1.method();
        instance2.method();

        //On the NotStaticClass class, refer to the static field - field
        NotStaticClass.field=1;
        instance1.method();
        instance2.method();
    }

}
