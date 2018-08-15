/**
 * In this package you will learn how to deal with the assortment of
 * different languages in a application.
 *
 * Enjoy the course and feel free to contribute.
 */
package Strategy_Languages;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Selector mySelector = new Selector();

        System.out.print("Select language (eng/ger): ");

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        switch (s) {
            case "eng":
                mySelector.setSprache(new English());
                break;
            case "ger":
                mySelector.setSprache(new German());
                break;
            default:
                System.out.println("");
                return;
        }

        System.out.println(mySelector.sayHello());
    }
}
