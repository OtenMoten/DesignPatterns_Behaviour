package Command_Calculator;

import java.util.EmptyStackException;
import java.util.Stack;

public class Calculator {

    Stack<IOperation> operationStack = new Stack<>();

    public void invoke(IOperation newOperation) {
        //  Add a new operation-object to the stack and
        this.operationStack.push(newOperation);
        //  ever time a new operation-objected is pushed to stack
        //  then the ".doIt()"-function is executed on the operation-object.
        //  What the ".doIt()"-function does is related to the given Commands-object
        //  if it's a plus-, minus-, ... object.
        newOperation.doIt();
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
        //  Get the latest element from the stack and

    }

}