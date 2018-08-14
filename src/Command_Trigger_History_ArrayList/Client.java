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
public class Client {

    public static void main(String[] args) {

        Lamp myLamp = new Lamp();
        Caller myCaller = new Caller();

        ACommand cmdLightON = new CmdLightOn(myLamp);
        ACommand cmdLightOFF = new CmdLightOff(myLamp);

        myCaller.save_execute(cmdLightON);
        myCaller.save_execute(cmdLightOFF);
        myCaller.save_execute(cmdLightON);

        System.out.println();
        System.out.println("All commands: ");
        myCaller.historyList.forEach((cmd) -> {
            cmd.execute();
        });

        System.out.println();
        System.out.println("Command #3 was: ");
        myCaller.historyList.get(2).execute();

    }

}
