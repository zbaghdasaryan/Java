package example_06_nestedclass;

 // Classes may contain static Nested classes.
class MyClass {
    public static class Nested {
        public static void staticMethodFromNested() {

            System.out.println("Static Method From Nested Class");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        MyClass.Nested.staticMethodFromNested();
    }
}
