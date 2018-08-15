/**
 * In this package you will learn how to manage different sorting algorithms
 * within a application.
 * 
 * Enjoy the course and feel free to contribute.
 */
package Strategy_Sorting;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Main {

    public static void main(String args[]) throws InterruptedException {

        int[] intArray_Alpha = {1, 5, 8, 2, 7, 4};
        for (int intElement : intArray_Alpha) {
            System.out.print(intElement + ", ");
        }
        System.out.println();

        //  Create a BubbleSort-object that is type of Context-class.
        Context myContext = new Context(new BubbleSort());

        for (int intElement : myContext.sort(intArray_Alpha)) {
            System.out.print(intElement + ", ");
        }
        System.out.println();
        System.out.println();

        //  Create a new InsertionSort-object in the same Context-object.
        myContext = new Context(new InsertionSort());

        int[] intArray_Beta = {13, 5, 88, 12, 7, 4, 45};
        for (int intElement : intArray_Beta) {
            System.out.print(intElement + ", ");
        }
        System.out.println();

        for (int intElement : myContext.sort(intArray_Beta)) {
            System.out.print(intElement + ", ");
        }
        System.out.println();

    }

}
