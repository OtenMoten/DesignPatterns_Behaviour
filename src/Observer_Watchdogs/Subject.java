/**
 * In this package you will learn how to track and trace operations within the code
 * on hand with the "Observer" behaviour design pattern.
 *
 * Enjoy the course and feel free to contribute.
 */
package Observer_Watchdogs;

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

    //  Before adding a new observer to a subject-object, the observer needs to
    //  be initialized with a subject-object. 
    //  A subject-object is directly connected to a observer. 
    // Therefore, you need to watch out when adding subjects and observer each other.
    @Override
    public void addObserver(AObserver newObserver) {
        this.listOfObservers.add(newObserver);
    }

    //  If a observer-object is removed from a subject-object's list, that is NOT
    //  meaning that the subject-object is no more linked to the observer-object.
    //  Therefore, you can easily add and remove observer to a subject-object.
    @Override
    public void removeObserver(AObserver observer) {
        this.listOfObservers.remove(observer);
    }

    //  Here we create our own notification-service. Because every subject-object
    //  has a list with the observers where it is in. Therefore, it can send 
    //  directly commands to it.
    @Override
    public void notifyAllObservers() {
        this.listOfObservers.forEach((observer) -> {
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
