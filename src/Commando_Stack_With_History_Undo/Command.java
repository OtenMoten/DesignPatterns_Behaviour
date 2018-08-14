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
class CmdLightOn extends ACommand {

    private final Lamp myLamp;

    public CmdLightOn(Lamp myNewLamp) {
        this.myLamp = myNewLamp;
    }

    @Override
    public void execute() {
        this.myLamp.turnOn();
        System.out.println(this.myLamp.toString());
    }

}

class CmdLightOff extends ACommand {

    private final Lamp myLamp;

    public CmdLightOff(Lamp myNewLamp) {
        this.myLamp = myNewLamp;
    }

    @Override
    public void execute() {
        this.myLamp.turnOff();
        System.out.println(this.myLamp.toString());
    }

}
