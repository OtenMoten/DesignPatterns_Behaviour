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
class BubbleSort implements ISorting {

    public int[] bubblesort(int[] intArray) {

        int intElement;

        for (int outerIterator = 1; outerIterator < intArray.length; outerIterator++) {

            for (int innerIterator = 0; innerIterator < intArray.length - outerIterator; innerIterator++) {

                if (intArray[innerIterator] > intArray[innerIterator + 1]) {
                    intElement = intArray[innerIterator];
                    intArray[innerIterator] = intArray[innerIterator + 1];
                    intArray[innerIterator + 1] = intElement;
                }
            }
        }
        return intArray;

    }

    @Override
    public int[] sort(int[] newIntArray) {
        System.out.println("Bubble sort executed.");
        return bubblesort(newIntArray);
    }

}
