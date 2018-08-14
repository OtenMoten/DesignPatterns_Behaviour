/**
 * In this package you will learn how to manage a simple trigger function with
 * history management.
 *
 * Enjoy the course and feel free to contribute.
 */
package Command_Trigger_History_Stack;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.EmptyStackException;
import java.util.Stack;

//  The "Caller"-class offers additional functions for a "ACommand"-object.
public class Caller {

    Stack<ACommand> historyStack = new Stack<>();

    public void save_execute(ACommand commando) {
        this.historyStack.push(commando);
        commando.execute();
    }

    public void ctrlZ() {

        try {
            //  Get the last command from the stack and
            ACommand commando = this.historyStack.pop();
            //  execute this command.
            commando.execute();
        } catch (EmptyStackException emptyStackExceptionObject) {
            //  Print error message if there is a exception
            System.out.println("Exception occured: " + emptyStackExceptionObject.toString());
            System.out.println("The stack is already empty!");
        }

    }

}
