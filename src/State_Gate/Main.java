/**
 * In this package you will learn how to deal with different states of a object.
 * It should seem to be that the object is changing it's class-type
 * while running. This is the keypoint of the "State"-pattern.
 *
 * Enjoy the course and feel free to contribute.
 */
package State_Gate;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Main {

    public static void main(String[] args) {

        //  Create a new gate.
        //  Remember, every new gate is initial closed.
        Gate myGate = new Gate();

        //  Try to close the gate.
        myGate.close();
        //  Try the open the gate twice.
        myGate.open();
        myGate.open();
        //  Try to close the gate twice.
        myGate.close();
        myGate.close();

    }

}
