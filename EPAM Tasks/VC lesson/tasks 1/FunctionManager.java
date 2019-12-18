package vc.lesson.tasks;

public class FunctionManager {

    //1. Գրել մեթոդ, որը ստանում է 2 հատ int պարամետր և վերադարձնում դրանց գումարը։
    public static int sum(int number1, int number2) {

        return number1 + number2;
    }

    //2. Գրել մեթոդ, որը ստանում է 2 հատ double պարամետր և վերադարձնում դրանց արտադրյալը։
    public static double multiply(double number1, double number2) {

        return number1 * number2;
    }

    //3. Գրել մեթոդ, որը ստանում է 2 հատ float պարամետր։ Տպել "Yes", եթե առաջինը մեծ է երկրորդից և "No" հակառակ դեպքում։
    public static void printYesOrNo(float number1, float number2) {
        if (number1 > number2) {
            System.out.println("Yes");
        } else System.out.println("No");
    }

    //3. Գրել մեթոդ, որը ստանում է 3 հատ long պարամետր և տպել դրանցից մեծը։
    public static long printBiggest(long number1, long number2, long number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            return number2;
        } else return number3;
    }
}
