// Расширение класса BoxWeight включением в него
//поля стоимости доставки
// создать сначала класс Вох
class Вох {
    private double width;
    private double height;
    private double depth;

    // сконструировать клон объекта
    Вох(Вох ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
// конструктор, применяемый при указании всех размеров

        Box(double w, double h, double d){
            width = w;
            height = h;
            depth = d;
        }
// конструктор, применяемый в отсутствие размеров

        Box() {
            width = -1;
            height = -1;
            depth = -1;
        }
// значение -1 служит для обозначения
// неинициализированного
// параллелепипеда
// конструктор, применяемый при создании куба
        Box( double len){
            width = height = depth = len;
//рассчитать и возвратить объем
            double vol urne() {
                return width * height * depth;
//добавить поле веса
                class BoxWeight extends Вох {
                    double weight; // вес параллелепипеда

                    // сконструировать клон объекта
                    BoxWeight(BoxWeight оЬ)
super

                    {
                        ob);
                        { // передать объект конструктору
                            weight = ob.weight;
                            ! / конструктор, применяемый при указании всех параметров
                            BoxWeight( double w, double h, double d, double rn)
                            super(w, h, d); //вызвать конструктор суперкласса
                            weight = rn;
// конструктор, применяемый по умолчанию
                            BoxWeight() {
                            super();
                            weight = -1;
//конструктор, применяемый при
                            BoxWeight( double len, double rn)
                            super(len);
                            weight = rn;
                            создании куба
                            {
                                11 добавить поле стоимости доставки
                                class Shiprnent extends BoxWeight {
                                    douЫe cost;
11
                                    сконструировать клон

                                    объекта
                                    Shiprnent(Shiprnent obl //передать объект конструктору
super(оЬ);

                                    cost =ob.cost;
233
        234Часть 1.
                                    Язык Java
11конструктор,
                                    используемый при
                                    указании всех

                                    параметров
                                    Shipment(douЫe w, douЫe h, douЫe d,
                                             douЫe m, douЫe с) {
                                        super(w, h, d, m);
                                        11 вызвать конструктор суперкласса
                                                cost = с;
                                        11 конструктор, применяемый по умолчанию
                                        Shipment() {
                                            super();
                                            cost = -1;
                                            11 конструктор, применяемый при создании куба
                                            Shipment(douЫe len, douЫe m, douЫe с) {
                                                super(len, m);
                                                cost = с;
                                                class DemoShipment {
                                                    puЬlic

                                                    static void main(String args[])

                                                    Shipment shipmentl =
                                                            new Shipment(lO, 20, 15, 10, 3.41);
                                                    Shipment shipment2 =
                                                            new Shipment(2, 3, 4, 0.76, 1.28);
                                                    douЬle vol;
                                                    vol =shipmentl.volume();
System.out.println("Oбъeм shipmentl равен "
        +vol);
System.out.println("Bec shipmentl равен "
        +shipmentl.weight);
System.out.println("Cтoимocть доставки: $"
        +shipmentl.cost);
System.out.println();
                                                    vol =shipment2.volume();
System.out.println("Oбъeм shipment2 равен "+vol);
System.out.println("Bec shipment2 равен "
        +shipment2.weight);
System.out.println("Cтoимocть доставки: $"
        +shipment2.cost);

