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
class Observer_Alpha extends AObserver {

    public Observer_Alpha(ISubject myNewSubject) {
        super(myNewSubject);
    }

    @Override
    public void printUpdate(int state) {
        super.printUpdate(state);
        System.out.println("Alpha-Observer is taking action. "
                + "Add 100 to the state = " + (state + 100) + ".");
    }

}

class Observer_Beta extends AObserver {

    public Observer_Beta(ISubject myNewSubject) {
        super(myNewSubject);
    }

    @Override
    public void printUpdate(int state) {
        super.printUpdate(state);
        System.out.println("Beta-Observer is taking action. "
                + "Add 200 to the state = " + (state + 200) + ".");
    }

}

class Observer_Gamma extends AObserver {

    public Observer_Gamma(ISubject myNewSubject) {
        super(myNewSubject);
    }

    @Override
    public void printUpdate(int state) {
        super.printUpdate(state);
        System.out.println("Gamma-Observer is taking action. "
                + "Add 300 to the state = " + (state + 300) + ".");
    }

}
