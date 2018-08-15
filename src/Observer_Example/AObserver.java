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
//  Every child-class will inheritate the interface "IObserver".
//  Therefore, every child of the abstract-class "AObserver" is
//  able to execute the command ".update()".
abstract class AObserver implements IObserver {

    private final ISubject mySubject;

    public AObserver(ISubject newSubject) {
        this.mySubject = newSubject;
        this.mySubject.addObserver(this);
    }

    @Override
    public void update() {
        int newState = ((Subject) this.mySubject).getState();
        //  Print that a update occured.
        printUpdate(newState);
    }

    //  We create a extra function for the output of a text message.
    public void printUpdate(int state) {
        System.out.print("The new state of '" + this.getClass().getSimpleName() + "' = " + state + "\t");
    }

}
