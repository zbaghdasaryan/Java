public class Tasks {

    //1. Հայտարարել զանգված եւ տպել այն։

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //2. Հայտարարել int -երի զանգված եւ լցնել 0-րով։
    public static void fillZeroValue(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;

            System.out.print(array[i] + " ");
        }
    }

    //3. Հայտարարել int -երի զանգված եւ լցնել 1- 1000 թվերով։
    public static void fillArrayFrom1To1000() {
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = i + 1;

            System.out.print(array[i] + " ");
        }
    }

    //4. Հայտարարել byte-երի զանգված եւ լցնել [-30;30] միջակայքի զույգ թվերով։
    public static void fillArrayEven() {
        byte[] array = new byte[30];
        byte a = -30;
        for (int i = 0; i < array.length; i++) {

            array[i] = a;
            System.out.print(array[i] + " ");

            a += 2;
            if (a == 0)
                a += 2;
        }
    }

    //5. Հայտարարել short-երի զանգված եւ լցնել [1;300] միջակայքի կենտ թվերով։
    public static void fillArrayOdd() {
        short[] array = new short[150];
        short a = 1;
        for (int i = 0; i < array.length; i++) {

            array[i] = a;
            System.out.print(array[i] + " ");

            a += 2;
        }
    }

    //6. Հայտարարել int -երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք բաժանվում են 5-ի։
    public static void printElementWhichIsDivided5(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 5 == 0)
                System.out.print(array[i] + " ");
        }
    }

    //7. Հայտարարել double-երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք մեծ են 24.56-ից։
    public static void printElementWhichIsMoreThen(double array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 24.56)
                System.out.print(array[i] + " ");
        }
    }

    //8. Հայտարարել float-երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք մեծ են 35.56-ից կամ փոքր են -34.655-ից։
    public static void printElementWhichIsMoreAndLessThen(float array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 35.56f || array[i] < -34.655f)
                System.out.print(array[i] + " ");
        }
    }

    //9. Հայտարարել double-երի զանգված եւ լցնել այն։Դասավորել ըստ աճման / նվազման կարգով։
    public static void BubbleSort(double array[]) {
        System.out.print("Unsorted array is: ");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("\nSorted array is: ");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }

    //10. Հայտարարել String փոփոխական եւ տպել նրանում եղած 'a' տառերի քանակը։
    public static int printCountOfCharA(String text) {
        char[] array = text.toCharArray();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a') {
                count++;
            }
        }
        return count;
    }

    //11. Հայտարարել String փոփոխական եւ տպել Yes եթե նրանում կա 'b' տառ եւ 'no' հակառակ դեպքում:
    public static void printYesOrNo(String text) {


        char[] array = text.toCharArray();
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'b') {
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("Yes");
        else System.out.println("no");

    }

    //12. Հայտարարել int -երի զանգված եւ լցնել այն։ Տպել 2-ի աստիճան հանդիսացող էլեմենտների քանակը։
    public static void printElementIfDegreeOf2(int array[]) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && (array[i] & (array[i] - 1)) == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }


    public static void main(String[] args) {
        int arrayInt[] = {0, 1, 2, 3, 4, 5, 8, 25, 75, 101};
        double arrayDouble[] = {2.54, 58.7, 11.2, 2.1, 0.1, 101.2, 200, 24.56};
        float arrayFloat[] = {2.54f, 58.7f, 11.2f, 2.1f, 0.1f, 101.2f, -200f, 24.56f};
//        //Task 1
//        printArray(arrayInt);
//
//        //Task 2
//        fillZeroValue(100);
//
//        //Task 3
//        fillArrayFrom1To1000();

//        //Task 4
//        fillArrayEven();

//        //Task 5
//        fillArrayOdd();

//        //Task 6
//        printElementWhichIsDivided5(arrayInt);

//        //Task 7
//        printElementWhichIsMoreThen(arrayDouble);

//        //Task 8
//        printElementWhichIsMoreAndLessThen(arrayFloat);

//        //Task 9
//        BubbleSort(arrayDouble);

//        //Task 10
//        System.out.println(printCountOfCharA("anything"));

//        //Task 11
//        printYesOrNo("abcdefg");

        //Task 12
        printElementIfDegreeOf2(arrayInt);

    }
}
