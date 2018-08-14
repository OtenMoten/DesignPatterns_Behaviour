/**
 * In this package you will learn how to manage a
 * bunch of commands with history management.
 * We will use the class "ArrayList".
 *
 * Enjoy the course and feel free to contribute.
 */
package Commando_List_With_History;

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
