import com.sun.deploy.security.SelectableSecurityManager;

import java.awt.*;
import java.io.Console;
import java.io.PrintStream;
import java.util.Scanner;

public class UpperChar {

    public static void ChangeCharToUpper(String anyText) {

        //This method change the text letters to upper letter, every next time its change next letter
        // (text="abc", result: Abc, aBc, abC, Abc, aBc, abC)
        char[] text = anyText.toCharArray();

        while (true)
            for (int n = 0; n < text.length; n++) {
                for (int i = 0; i < text.length; i++) {

                    if (i == n)
                        System.out.print((char) (text[i] - 32));

                    else
                        System.out.print(text[i]);
                }
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                }
                System.out.println(); // in this place was supposed to be setConsoleCursorPosition(0,0) method :)))
            }
    }

    //This method change the text letters to upper letter, every next time its change next letter
    // (text="abc", result: Abc, aBc, abC, aBc, Abc, aBc)
    public static void ChangeCharToUpperAndBack(String anyText) {

        char[] text = anyText.toCharArray();

        boolean flag = true;
        while (true) {
            if (flag) {
                for (int n = 0; n < text.length; n++) {
                    for (int i = 0; i < text.length; i++) {

                        if (i == n)
                            System.out.print((char) (text[i] - 32));

                        else
                            System.out.print(text[i]);
                    }
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                    System.out.println(); // in this place was supposed to be setConsoleCursorPosition(0,0) method :)))
                }
            } else {
                for (int n = text.length - 2; n > 0; n--) {
                    for (int i = 0; i < text.length; i++) {

                        if (i == n)
                            System.out.print((char) (text[i] - 32));

                        else
                            System.out.print(text[i]);
                    }
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                    System.out.println(); // in this place was supposed to be setConsoleCursorPosition(0,0) method :)))
                }
            }
            flag = !flag;
        }
    }


    public static void Loading() {
        String t = "|/-\\";
        char[] text = t.toCharArray();
        while (true)
            for (int i = 0; i < text.length; i++) {
                System.out.println(text[i]);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write any text: ");

        //ChangeCharToUpper(scanner.nextLine());
        // ChangeCharToUpperAndBack(scanner.nextLine());
        // Loading();
    }
}


