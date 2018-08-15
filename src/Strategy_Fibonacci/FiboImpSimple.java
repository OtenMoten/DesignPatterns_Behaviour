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
public class FiboImpSimple {

    static int iSaveInt;

    static long fiboImpSimple(int newInt) {

        int fibonacci_Alpha = 1;
        int fibonacci_Beta = 1;
        int fibo_Extra = fibonacci_Alpha;

        for (iSaveInt = 0; iSaveInt < newInt; iSaveInt++) {
            fibo_Extra += fibonacci_Beta;
            fibonacci_Beta = fibo_Extra;
        }
        return fibo_Extra;
    }

}
