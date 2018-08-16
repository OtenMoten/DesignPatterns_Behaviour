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
class Gate {

    private AState state;

    //  A new gate is always closed.
    public Gate() {
        System.out.println("A new and closed gate was created.");
        this.state = new CloseGate(this);
    }

    public void setState(AState newState) {
        this.state = newState;
    }

    public void open() {
        this.state.open();
    }

    public void close() {
        this.state.close();
    }

}
