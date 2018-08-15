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
import java.util.Observer;

abstract class AObserver implements Observer {

    private final Subject mySubject;

    public AObserver(Subject newSubject) {
        this.mySubject = newSubject;
        this.mySubject.addObserver(this);
    }

    @Override
    public void update(Observable observableObject, Object object) {
        boolean newState = mySubject.getState();
        fakeUpdate(newState);
    }

    public void fakeUpdate(boolean newState) {
        System.out.println("I do fake update. "
                + this.getClass().getSimpleName()
                + " current state: " + newState);
    }
}

class ObserverAlpha extends AObserver {

    public ObserverAlpha(Subject newSubject) {
        super(newSubject);
    }

    @Override
    public void fakeUpdate(boolean newState) {
        boolean invertState = !newState;
        System.out.println(this.getClass().getSimpleName()
                + " inverted state = " + invertState);
    }

}

class ObserverBeta extends AObserver {

    public ObserverBeta(Subject newSubject) {
        super(newSubject);
    }

    @Override
    public void fakeUpdate(boolean newState) {
        boolean invertState = !newState;
        System.out.println(this.getClass().getSimpleName()
                + " inverted state = " + invertState);
    }

}

class ObserverGamma extends AObserver {

    public ObserverGamma(Subject newSubject) {
        super(newSubject);
    }

    @Override
    public void fakeUpdate(boolean newState) {
        boolean invertState = !newState;
        System.out.println(this.getClass().getSimpleName()
                + " inverted state = " + invertState);
    }

}
