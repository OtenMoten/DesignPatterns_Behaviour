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
class OpenGate extends AState {

    public OpenGate(Gate myGate) {
        super(myGate);
    }

    @Override
    public void open() {
        System.out.println("Open button pushed: >> FAILED.");
    }

    @Override
    public void close() {
        System.out.println("Close button pushed: ");
        super.gate.setState(new CloseGate(super.gate));
        System.out.println(">> The gate is closed now.");
    }

}
