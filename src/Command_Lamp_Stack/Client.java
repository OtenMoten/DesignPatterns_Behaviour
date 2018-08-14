package Command_Lamp_Stack;

public class Client {

    public static void main(String[] args) {

        Lamp myLamp = new Lamp();
        Caller myCaller = new Caller();
        
        LampOn cmdLampOn = new LampOn(myLamp);
        LampOff cmdLampOff = new LampOff(myLamp);
        
        myCaller.save_execute(cmdLampOn);
        myCaller.save_execute(cmdLampOff);
        myCaller.save_execute(cmdLampOn);

        System.out.println();
        System.out.println("All commands -------------");
        myCaller.history.forEach((cmd) -> {
            cmd.execute();
        });

        System.out.println();
        System.out.println("The last command ------------");
        myCaller.ctrlZ();

        System.out.println("The very last command ------------");
        myCaller.ctrlZ();

        System.out.println("The very very last command ------------");
        myCaller.ctrlZ();
        
        //  Will throw a error message.
        System.out.println("Really, the very last command! ------------");
        myCaller.ctrlZ();
        
    }

}