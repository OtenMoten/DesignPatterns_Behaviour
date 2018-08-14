package Command_Lamp_Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class Caller {

    Stack<Command> history = new Stack<>();

    public void save_execute(Command cmd) {
        this.history.push(cmd);
        cmd.execute();
    }

    public void ctrlZ() {

        try {
            Command cmd = this.history.pop();
            cmd.execute();
        } catch (EmptyStackException emptyStackExceptionObject) {
            //  Print error message if there is a exception
            System.out.println("Exception occured: " + emptyStackExceptionObject.toString());
            System.out.println("The stack is already empty!");
        }

    }

}