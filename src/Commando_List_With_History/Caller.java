/**
 * In this package you will learn how to manage a
 * bunch of commands with history management.
 * We will use the class "ArrayList".
 *
 * Enjoy the course and feel free to contribute.
 */
package Commando_List_With_History;

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
