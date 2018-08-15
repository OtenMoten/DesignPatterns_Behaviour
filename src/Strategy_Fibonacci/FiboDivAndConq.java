/**
 * In this package you will learn how to manage different mathematical
 * formulas of the Fibonacci term.
 *
 * Enjoy the course and feel free to contribute.
 */
package Strategy_Fibonacci;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class FiboDivAndConq {

    static int iSaveInt;

    static long fibDivConq(int newInt) {

        iSaveInt++;

        if (newInt == 0 || newInt == 1) {
            return newInt;
        } else {
            long a = fibDivConq((newInt + 1) / 2);
            long b = fibDivConq((newInt + 1) / 2 - 1);

            if (newInt % 2 == 0) {
                return a * (a + 2 * b);
            } else {
                return a * a + b * b;
            }
        }

    }

}
