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
interface IOperation {

    void combine();

    void undo();

}
