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
public class Main {

    public static void main(String[] args) {

        int iSaveInteger = 20;
        
        System.out.println("running");
        
        System.out.print("ImpComplex: ");
        System.out.println(FiboImpComplex.fiboImpComplex(iSaveInteger));
        System.out.print("Extra value: ");
        System.out.println(FiboImpComplex.iSaveInt);
        System.out.println();
        
        System.out.print("ImpSimple: ");
        System.out.println(FiboImpSimple.fiboImpSimple(iSaveInteger));
        System.out.print("Extra value: ");
        System.out.println(FiboImpSimple.iSaveInt);
        System.out.println();
        
        System.out.print("Recursive: ");
        System.out.println(FiboRecursive.fiboRecursive(iSaveInteger));
        System.out.print("Extra value: ");
        System.out.println(FiboRecursive.iSaveInt);
        System.out.println();
        
        
        System.out.print("Div and Conq: ");
        System.out.println(FiboDivAndConq.fibDivConq(iSaveInteger));
        System.out.print("Extra value: ");
        System.out.println(FiboDivAndConq.iSaveInt);
        System.out.println();

    }

}
