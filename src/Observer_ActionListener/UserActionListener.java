/**
 * In this package you will learn how to create and use your own actionlistener.
 *
 * Enjoy the course and feel free to contribute.
 */
package Observer_ActionListener;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEventObject) {
        System.out.println(actionEventObject.getActionCommand() + " clicked. "
                + "Program will exit.");
        System.exit(0);

    }

}
