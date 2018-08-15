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
class Context {

    private final ISorting mySortingAlgorithm;

    public Context(ISorting newSortingAlogrithm) {
        this.mySortingAlgorithm = newSortingAlogrithm;
    }

    public int[] sort(int[] newIntArray) {
        return this.mySortingAlgorithm.sort(newIntArray);
    }

}
