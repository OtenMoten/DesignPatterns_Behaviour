package Command_Lamp_ArrayList;

import java.util.ArrayList;

public class Caller {

    ArrayList<ACommand> history = new ArrayList();

    public void save_execute(ACommand cmd) {
        history.add(cmd);
        cmd.execute();
    }

}