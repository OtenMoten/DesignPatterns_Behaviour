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
public class FiboRecursive {

    static int iSaveInt;

    static long fiboRecursive(int newInt) {
        iSaveInt++;
        if ((newInt == 0) || (newInt == 1)) {
            return newInt;
        } else {
            return fiboRecursive(newInt - 1) + fiboRecursive(newInt - 2);
        }
    }

}
