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
import java.math.BigInteger;

public class FiboImpComplex {

    static int iSaveInt;

    static String fiboImpComplex(int newInt) {

        BigInteger fibonacci_Alpha = BigInteger.ONE;
        BigInteger fibonacci_Beta = BigInteger.ONE;
        BigInteger fibonacci_Extra = fibonacci_Alpha;

        for (int interator = 0; interator < newInt; interator++) {
            iSaveInt++;
            fibonacci_Extra = fibonacci_Alpha.add(fibonacci_Beta);
            fibonacci_Alpha = fibonacci_Beta;
            fibonacci_Beta = fibonacci_Extra;
        }
        return fibonacci_Extra.toString();

    }

}
