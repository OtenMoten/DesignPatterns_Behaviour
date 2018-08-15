/**
 * In this package you will learn how to track and trace operations within the code
 * on hand with the "Observer" behaviour design pattern.
 *
 * Enjoy the course and feel free to contribute.
 */
package Observer_Example;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin
 */
class Subject implements ISubject {

    List<AObserver> listOfObservers = new ArrayList<>();

    int state = 0;

    @Override
    public void addObserver(AObserver newObserver) {
        this.listOfObservers.add(newObserver);
    }

    @Override
    public void removeObserver(AObserver observer) {
        this.listOfObservers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        listOfObservers.forEach((observer) -> {
            observer.update();
        });
    }

    public int getState() {
        return this.state;
    }

    public void setState(int newState) {
        this.state = newState;
        this.notifyAllObservers();
    }

}
