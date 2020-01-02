public class Main {

    public static void main(String[] args) {

        IPrintable printable = createPrintable("Foreign Affairs",false);
        printable.print();

        read(new Book("Java for impatients", "Cay Horstmann"));
        read(new Journal("Java Dayly News"));

    }
    static void read(IPrintable p){

        p.print();
    }
    static IPrintable createPrintable(String name, boolean option){

        if(option)
            return new Book(name, "Undefined");
        else
            return new Journal(name);
    }
}
