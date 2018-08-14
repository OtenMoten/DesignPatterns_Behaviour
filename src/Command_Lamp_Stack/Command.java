package Command_Lamp_Stack;

public abstract class Command {
    abstract void execute();
}

class LampOn extends Command {

    private final Lamp myLamp;

    public LampOn(Lamp myNewLamp) {
        this.myLamp = myNewLamp;
    }

    @Override
    public void execute() {
        this.myLamp.lampOn();
        System.out.println(this.myLamp);
    }
    
}

class LampOff extends Command {

    private final Lamp myLamp;

    public LampOff(Lamp myNewLamp) {
        this.myLamp = myNewLamp;
    }

    @Override
    public void execute() {
        this.myLamp.lampOff();
        System.out.println(this.myLamp);
    }
    
}