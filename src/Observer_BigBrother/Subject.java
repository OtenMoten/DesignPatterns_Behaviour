/**
 * In this package you will learn how to create and use your own observer.
 *
 * Enjoy the course and feel free to contribute.
 */
package Observer_BigBrother;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.Observable;

public class Subject extends Observable {

    boolean state = false;

    public boolean getState() {
        return this.state;
    }

    public void setOn() {
        this.state = true;
        this.setChanged();
        this.notifyObservers();
    }

    public void setOff() {
        this.state = false;
        this.setChanged();
        this.notifyObservers();
    }

}
