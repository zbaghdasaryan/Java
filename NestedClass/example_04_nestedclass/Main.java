package example_04_nestedclass;

class MyClass { // BaseClass inheritance does not apply.
    public class Inner extends BaseClass {
        public void methodFromNested() {
            System.out.println("Method From Inner Class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Inner instance = new MyClass().new Inner();

        instance.methodFromBase();
        instance.methodFromNested();
    }
}