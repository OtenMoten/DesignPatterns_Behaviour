/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command_Lamp_ArrayList;

/**
 *
 * @author Kevin
 */
public class Client {

    public static void main(String[] args) {

        Lamp myLamp = new Lamp();
        Caller myCaller = new Caller();
        
        LampOn myLampOn = new LampOn(myLamp);
        LampOff myLampOff = new LampOff(myLamp);
        
        myCaller.save_execute(myLampOn);
        myCaller.save_execute(myLampOff);
        myCaller.save_execute(myLampOn);

        System.out.println();
        System.out.println("All commands -------------");
        myCaller.history.forEach((cmd) -> {
            cmd.execute();
        });

        System.out.println();
        System.out.println("Command #3 ------------");
        myCaller.history.get(2).execute();

    }

}
