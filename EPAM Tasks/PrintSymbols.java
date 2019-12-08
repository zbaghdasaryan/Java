import java.util.Scanner;

public class PrintSymbols {

    int numberOfColumns; // max size of figure

    /*

     *
     **
     ***
     ****
     *****
     ******

     */
    public static void regionA(int n) {
        System.out.println("Figure for region A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }


    /*

     *************
     ***********
     *********
     *******
     *****
     ***
     *
     */

    public static void regionB(int n) {
        System.out.println("Figure for region B");
        for (int i = n; i > 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*

     *
     **
     ***
     ****
     *****
     ******

     */

    public static void regionC(int n) {
        System.out.println("Figure for region C");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                System.out.print(" ");
            }
            for (int l = 0; l < i + 1; l++) {

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }


    /*

     ******
     *****
     ****
     ***
     **
     *

     */

    public static void regionD(int n) {
        System.out.println("Figure for region D");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*
     *
     ***
     *****
     *******
     *********
     ***********

     */

    public static void regionE(int n) {
        System.out.println("Figure for region E");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*

     ******
     *****
     ****
     ***
     **
     *

     */

    public static void regionF(int n) {
        System.out.println("Figure for region F");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print(" ");
            }
            for (int l = 0; l < n - i; l++) {

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*

     *
     **
     * *
     *  *
     *   *
     ******

     */
    public static void emptyRegionA(int n) {
        System.out.println("Figure for empty region A");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*
     *
     * *
     *   *
     *     *
     *       *
     ***********
     */
    public static void emptyRegionB(int n) {
        System.out.println("Figure for empty region B");
        for (int i = 1; i <= n; i++) {

            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (i * 2) - 1; k++) {
                if (k == 1 || k == (i * 2) - 1 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*

     ******
     *   *
     *  *
     * *
     **
     *
     */
    public static void emptyRegionC(int n) {
        System.out.println("Figure for empty region C");
        for (int i = 1; i <= n; i++) {

            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                if (k == 0 || k == i - 1 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }


    /*

     ******
     *   *
     *  *
     * *
     **
     *

     */

    public static void emptyRegionD(int n) {
        System.out.println("Figure for empty region D");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (i == 0 || j == 0 || j == n - i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*
     *
     * *
     *   *
     *     *
     *       *
     ***********
     */

    public static void emptyRegionE(int n) {
        System.out.println("Figure for empty region E");
        for (int i = n; i > 0; i--) {

            for (int j = 1; j <= (i * 2) - 1; j++) {
                if (j == 1 || j == (i * 2) - 1 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    /*

     ******
     *   *
     *  *
     * *
     **
     *
     */
    public static void emptyRegionF(int n) {
        System.out.println("Figure for empty region F");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < n; k++) {
                if (i == 0 || k == i || k == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        PrintSymbols printSymbols = new PrintSymbols();
        System.out.print("Enter number of columns: ");
        Scanner scanner = new Scanner(System.in);
        printSymbols.numberOfColumns = scanner.nextInt();

        printSymbols.regionA(printSymbols.numberOfColumns);
        printSymbols.regionB(printSymbols.numberOfColumns);
        printSymbols.regionC(printSymbols.numberOfColumns);
        printSymbols.regionD(printSymbols.numberOfColumns);
        printSymbols.regionE(printSymbols.numberOfColumns);
        printSymbols.regionF(printSymbols.numberOfColumns);

        printSymbols.emptyRegionA(printSymbols.numberOfColumns);
        printSymbols.emptyRegionB(printSymbols.numberOfColumns);
        printSymbols.emptyRegionC(printSymbols.numberOfColumns);
        printSymbols.emptyRegionD(printSymbols.numberOfColumns);
        printSymbols.emptyRegionE(printSymbols.numberOfColumns);
        printSymbols.emptyRegionF(printSymbols.numberOfColumns);
    }
}
