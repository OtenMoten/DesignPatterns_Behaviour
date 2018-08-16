/**
 * In this package you will learn how to deal with different states of a object.
 *
 * Enjoy the course and feel free to contribute.
 */
package State_Gate;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
class CloseGate extends AState {

    public CloseGate(Gate inputGate) {
        super(inputGate);
    }

    @Override
    public void open() {
        System.out.println("Open button pushed: ");
        super.gate.setState(new OpenGate(super.gate));
        System.out.println(">> The gate is open now.");
    }

    @Override
    public void close() {
        System.out.println("Close button pushed: >> FAILED.");

    }
}
