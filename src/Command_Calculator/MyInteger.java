package Command_Calculator;

public class MyInteger {

    private int iSaveValue;

    public MyInteger(int newValue) {
        this.iSaveValue = newValue;
    }

    public void plus(int newValue) {
        this.iSaveValue += newValue;
    }

    public void minus(int newValue) {
        this.iSaveValue -= newValue;
    }

    public int getValue() {
        return this.iSaveValue;
    }

    public void setValue(int newValue) {
        this.iSaveValue = newValue;
    }
    
}