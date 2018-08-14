/**
 * In this package you will learn how to manage a undo-function with
 * with history-management related to a specific input.
 * We will use the class "Stack".
 *
 * Imagine you are a user with a calculator.
 *
 * Enjoy the course and feel free to contribute.
 */
package Input_Operations_Undo;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class MyInteger {

    private int iSaveValue;

    public MyInteger(int newValue) {
        this.iSaveValue = newValue;
    }

    public void plus(int newValue) {
        this.iSaveValue += newValue;
    }

    public void minus(int newValue) {
        this.iSaveValue -= newValue;
    }

    public int getValue() {
        return this.iSaveValue;
    }

    public void setValue(int newValue) {
        this.iSaveValue = newValue;
    }

}
