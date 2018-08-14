/**
 * In this package you will learn how to manage a simple trigger function with
 * history management.
 *
 * Enjoy the course and feel free to contribute.
 */
package Command_Trigger_History_Stack;

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
