/**
 * In this package you will learn how to manage a bunch of commands with a
 * undo-function and history management.
 * We will use the class "Stack".
 *
 * Enjoy the course and feel free to contribute.
 */
package Commando_Stack_With_History_Undo;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Lamp {

    boolean state;

    public void turnOn() {
        this.state = true;
    }

    public void turnOff() {
        this.state = false;
    }

    @Override
    public String toString() {
        return "Lamp " + ((this.state) ? "ON" : "OFF");
    }

}
