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
import java.util.EmptyStackException;
import java.util.Stack;

public class Calculator {

    Stack<IOperation> operationStack = new Stack<>();

    protected void invoke(IOperation newOperation) {
        //  Add a new operation-object to the stack and
        this.operationStack.push(newOperation);
        //  ever time a new operation-objected is pushed to stack
        //  then the ".combine()"-function is executed on the operation-object.
        //  What the ".combine()"-function does is related to the given Commands-object
        //  if it's a plus-, minus-, ... object.
        newOperation.combine();
    }

    public void undo() {

        try {

            IOperation operationObject = this.operationStack.pop();

            //  recover the input-state of the operation-object.
            operationObject.undo();

        } catch (EmptyStackException emptyStackExcObj) {
            System.out.print("Trying to get access on a emtpy cell!");
            System.out.println(" You can't request more from the stack! \n "
                    + "'" + emptyStackExcObj.toString()
                    + "'"
                    + " means there is no more operation in the stack.");
        }

    }

}
