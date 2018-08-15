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

public class FiboBigInteger {

    static int iSaveInt;

    static BigInteger fiboRecursive(BigInteger newBigInteger) {
        System.out.println(iSaveInt++);
        if ((newBigInteger.compareTo(BigInteger.ZERO) == 0)
                || (newBigInteger.compareTo(BigInteger.ONE) == 0)) {
            return newBigInteger;
        } else {
            return fiboRecursive(newBigInteger.subtract(BigInteger.ONE)).
                    add(fiboRecursive(newBigInteger.subtract(new BigInteger("2"))));
        }
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println("running");
        System.out.println(fiboRecursive(BigInteger.valueOf(n)).toString());
    }

}
