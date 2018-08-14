/**
 * In this package you will learn how to manage a simple trigger function with
 * history management and the class "ArrayList".
 *
 * Enjoy the course and feel free to contribute.
 */
package Command_Trigger_History_ArrayList;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.ArrayList;

//  The "Caller"-class offers additional functions for a "ACommand"-object.
public class Caller {

    ArrayList<ACommand> historyList = new ArrayList();

    public void save_execute(ACommand commando) {
        this.historyList.add(commando);
        commando.execute();
    }

}
