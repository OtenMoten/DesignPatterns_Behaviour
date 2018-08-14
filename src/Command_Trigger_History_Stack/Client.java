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
        }); System.out.println("--------------------");

        System.out.println();
        System.out.println("The last command:");
        myCaller.ctrlZ();

        System.out.println("The middle command:");
        myCaller.ctrlZ();

        System.out.println("The first command:");
        myCaller.ctrlZ();

        //  Will throw a error message.
        System.out.println("Really, this is the first command! ------------");
        myCaller.ctrlZ();

    }

}
