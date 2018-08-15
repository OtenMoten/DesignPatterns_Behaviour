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
public class Main {

    public static void main(String[] args) {

        //  Create a subject-object that is type of the class "Subject".
        Subject mySubject = new Subject();

        //  Create one of each observers and apply the subject-object to them.
        AObserver observerAlpha = new ObserverAlpha(mySubject);
        AObserver observerBeta = new ObserverBeta(mySubject);
        AObserver observerGamma = new ObserverGamma(mySubject);

        //  Apply a state to the subject.
        //  Watch the console output. 
        //  Every observer is been aware of the subject-object and
        //  do it certain type of action.
        mySubject.setOn();
        System.out.println();

        //  Remove the myBetaObserver-object.
        //  Remove the myGammaObserver-object.
        mySubject.deleteObserver(observerBeta);
        mySubject.deleteObserver(observerGamma);
        //  Now, we will turn off the state of our subject-object.
        mySubject.setOff();
        System.out.println();

        //  The Beta-observer is now added again to subject-object.
        //  The Gamma-observer is now added again to subject-object.
        mySubject.addObserver(observerBeta);
        mySubject.addObserver(observerGamma);
        //  Now, we will turn on again the state of our subject-object.
        mySubject.setOn();
        System.out.println();

    }

}
