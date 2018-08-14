package Command_Calculator;

class Plus implements IOperation {

    private final MyInteger myInteger_1;
    private final MyInteger myInteger_2;

    public Plus(MyInteger plusInt_1, MyInteger plusInt_2) {
        this.myInteger_1 = plusInt_1;
        this.myInteger_2 = plusInt_2;
    }

    //  "Main-function" of the class.
    @Override
    public void doIt() {
        this.myInteger_1.plus(this.myInteger_2.getValue());
    }

    //  The opposite of the "main-function".
    @Override
    public void undo() {
        this.myInteger_1.minus(this.myInteger_2.getValue());
    }
    
}

class Minus implements IOperation {

    private final MyInteger myInteger_1;
    private final MyInteger myInteger_2;

    public Minus(MyInteger plusInt_1, MyInteger plusInt_2) {
        this.myInteger_1 = plusInt_1;
        this.myInteger_2 = plusInt_2;
    }

    //  "Main-function" of the class.
    @Override
    public void doIt() {
        this.myInteger_1.minus(this.myInteger_2.getValue());
    }

    //  The opposite of the "main-function".
    @Override
    public void undo() {
        this.myInteger_1.plus(this.myInteger_2.getValue());
    }
    
}