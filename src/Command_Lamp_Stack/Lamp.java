package Command_Lamp_Stack;

public class Lamp {

    boolean state;

    public void lampOn() {
        this.state = true;
        System.out.print("Turn the lights on.");
    }

    public void lampOff() {
        this.state = false;
        System.out.print("Turn the lights off.");
    }

    @Override
    public String toString() {
        return "Lamp " + ((this.state) ? "ON" : "OFF");
    }
    
}