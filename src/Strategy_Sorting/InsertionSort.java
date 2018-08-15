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
class InsertionSort implements ISorting {

    public int[] insertionSort(int[] intArray) {

        int intElement;
        int whileIterator;

        for (int forIterator = 1; forIterator < intArray.length; forIterator++) {

            intElement = intArray[forIterator];
            whileIterator = forIterator;

            while (whileIterator > 0 && intArray[whileIterator - 1] > intElement) {
                intArray[whileIterator] = intArray[whileIterator - 1];
                whileIterator--;
            }
            intArray[whileIterator] = intElement;
        }

        return intArray;

    }

    @Override
    public int[] sort(int[] newIntArray) {
        System.out.println("Insertion sort executed.");
        return insertionSort(newIntArray);
    }

}
