/**
 * In this package you will learn how to manage a simple trigger function with
 * history management and the class "ArrayList".
 *
 * Enjoy the course and feel free to contribute.
 */
package Command_Trigger_History_ArrayList;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Lamp {

    boolean status;

    public void turnOn() {
        this.status = true;

    }

    public void turnOff() {
        this.status = false;
    }

    @Override
    public String toString() {
        return "Lamp " + ((this.status) ? "ON" : "OFF");
    }
}
