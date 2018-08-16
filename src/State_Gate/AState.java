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
abstract class AState {

    protected Gate gate;

    public AState(Gate myGate) {
        this.gate = myGate;
    }

    public abstract void open();

    public abstract void close();

}
