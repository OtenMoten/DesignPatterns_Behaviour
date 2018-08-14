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
public class Client {

    public static void main(String[] args) {

        Lamp myLamp = new Lamp();
        Caller myCaller = new Caller();

        ACommand cmdLightON = new CmdLightOn(myLamp);
        ACommand cmdLightOFF = new CmdLightOff(myLamp);

        myCaller.save_execute(cmdLightON);
        myCaller.save_execute(cmdLightOFF);
        myCaller.save_execute(cmdLightOFF);

        System.out.println();
        System.out.println("All commands:");
        myCaller.historyStack.forEach((cmd) -> {
            cmd.execute();
        });
        System.out.println("--------------------");

        System.out.println();
        System.out.println("The last command:");
        myCaller.undo();

        System.out.println("The middle command:");
        myCaller.undo();

        System.out.println("The first command:");
        myCaller.undo();

        //  Will throw a error message.
        System.out.println("Really, this is the first command! ------------");
        myCaller.undo();

    }

}
