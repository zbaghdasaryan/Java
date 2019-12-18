package example_05_nestedclass;

class MyClass extends BaseClass {
    public class Inner // BaseClass inheritance does not apply.
    {
        public void methodFromNested() {
            System.out.println("Method From Inner Class.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass instance1 = new MyClass();
        instance1.methodFromBase();

        MyClass.Inner instance2 = new MyClass().new Inner();
        instance2.methodFromNested();
    }
}
