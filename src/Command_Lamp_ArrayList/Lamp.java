package Command_Lamp_ArrayList;

public class Lamp {

    boolean status;

    public void lampOn() {
        this.status = true;
        System.out.print("Turn the light on. ");
    }

    public void lampOff() {
        this.status = false;
        System.out.print("Turn the light off. ");
    }

    @Override
    public String toString() {
        return "Lamp " + ((this.status) ? "On" : "Off");
    }
}
