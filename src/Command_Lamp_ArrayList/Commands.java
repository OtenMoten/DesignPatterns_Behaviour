package Command_Lamp_ArrayList;

class LampOn extends ACommand {

    private final Lamp myLamp;

    public LampOn(Lamp myLampON) {
        this.myLamp = myLampON;
    }

    @Override
    public void execute() {
        this.myLamp.lampOn();
        System.out.println(this.myLamp);
    }
    
}

class LampOff extends ACommand {

    private final Lamp myLamp;

    public LampOff(Lamp myLampOFF) {
        this.myLamp = myLampOFF;
    }

    @Override
    public void execute() {
        this.myLamp.lampOff();
        System.out.println(this.myLamp);
    }
    
}