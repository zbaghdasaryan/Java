package example_01_nestedclass;

class MyClass {
    public class Inner { //Inner class is a class which is in the other class body. If its static it is Nested class
        public void method() {
            System.out.println("Inner class method");
        } //Inner classes cannot have static declarations. You cant write <<public static method or filed>>
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Inner instance = new MyClass().new Inner();
        instance.method();

    }
}