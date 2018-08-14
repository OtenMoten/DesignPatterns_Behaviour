/**
 * In this package you will learn how to manage a undo-function related to
 * a specific input with history management and the class "Stack".
 * Imagine you are a user with a calculator.
 *
 * Enjoy the course and feel free to contribute.
 */
package Command_Undo_Numberinput;

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
