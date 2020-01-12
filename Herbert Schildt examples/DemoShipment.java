import javax.swing.*;

// Расширение класса BoxWeight включением в него
//поля стоимости доставки
// создать сначала класс Вох
class Box {
    private double width;
    private double height;
    private double depth;

    // сконструировать клон объекта
    Box(Box ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый в отсутствие размеров
    // значение -1 служит для обозначения неинициализированного параллелепипеда
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор, применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

//добавить поле веса
class BoxWeight extends Box {

    double weight; // вес параллелепипеда

    // сконструировать клон объекта
    BoxWeight(BoxWeight ob) {// передать объект конструктору
        super(ob);
        weight = ob.weight;
    }
    // конструктор, применяемый при указании всех параметров

    public BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
// конструктор, применяемый по умолчанию

    public BoxWeight() {
        weight = -1;
    }

    //конструктор, применяемый при создании куба
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

// добавить поле стоимости доставки
class Shipment extends BoxWeight {
    double cost;

    // сконструировать клон объекта
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    // конструктор, используемый при указании всех параметров
    public Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    // конструктор, применяемый по умолчанию
    public Shipment() {
        super();
        cost = -1;
    }

    //конструктор, применяемый при создании куба
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

public class DemoShipment {
    public static void main(String[] args) {

        Shipment shipmentl =
                new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 =
                new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipmentl.volume();
        System.out.println("Oбъeм shipmentl равен " + vol);
        System.out.println("Bec shipmentl равен " + shipmentl.weight);
        System.out.println("Cтoимocть доставки: $" + shipmentl.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Oбъeм shipment2 равен " + vol);
        System.out.println("Bec shipment2 равен " + shipment2.weight);
        System.out.println("Cтoимocть доставки: $" + shipment2.cost);

    }
}
