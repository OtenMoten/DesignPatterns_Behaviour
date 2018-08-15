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
public class Main {

    public static void main(String[] args) {

        //  Create a subject-object that is type of the class "Subject".
        ISubject mySubject = new Subject();

        //  Create one of each observers and apply the subject-object to them.
        AObserver myAlphaObserver = new Observer_Alpha(mySubject);
        AObserver myBetaObserver = new Observer_Beta(mySubject);
        AObserver myGammaObserver = new Observer_Gamma(mySubject);

        //  Apply a state to the subject.
        //  Watch the console output. 
        //  Every observer is been aware of the subject-object and
        //  do it certain type of action.
        ((Subject) mySubject).setState(1);
        System.out.println();

        //  Now, we will adjust the state of our subject-object.
        System.out.println("Change state to '11'.");
        ((Subject) mySubject).setState(11);
        System.out.println();

        //  Remove the myGammaObserver-object.
        System.out.println("Beta-observer will be removed.");
        System.out.println("Gamma-observer will be removed.");
        mySubject.removeObserver(myBetaObserver);
        mySubject.removeObserver(myGammaObserver);

        //  Now, we will again adjust the state of our subject-object.
        System.out.println("Change state to '22'.");
        ((Subject) mySubject).setState(22);
        System.out.println();

        //  The Gamma-observer is now added again to subject-object.
        System.out.println("Add the Beta-observer again.");
        mySubject.addObserver(myBetaObserver);
        System.out.println("Add the Gamma-observer again.");
        mySubject.addObserver(myGammaObserver);

        //  Adjust the state again.
        System.out.println("Change state to '33'.");
        ((Subject) mySubject).setState(33);

    }

}
