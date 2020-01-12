public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("Body of method A");
            throw new RuntimeException("Demonstration");
        } finally {
            System.out.println("Finally in the method A");
        }
    }
    static void procB(){
        try{
            System.out.println("Body of method B");
            return;
        }finally {
            System.out.println("Finally in the method B");
        }
    }
    static void procC() {
        try {
            System.out.println("Body of method C");
        } finally {
            System.out.println("Finally in the method C");
        }
    }

    public static void main(String[] args) {
        try{
            procA();
        }catch (Exception e){
            System.out.println("Catch:" +e);
        }
        procB();
        procC();
    }
}
