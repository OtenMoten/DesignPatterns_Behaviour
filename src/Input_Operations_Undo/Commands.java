/**
 * In this package you will learn how to manage a undo-function with
 * with history-management related to a specific input.
 * We will use the class "Stack".
 *
 * Imagine you are a user with a calculator.
 *
 * Enjoy the course and feel free to contribute.
 */
package Input_Operations_Undo;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
class Plus implements IOperation {

    private final MyInteger myInteger_1;
    private final MyInteger myInteger_2;

    public Plus(MyInteger plusInt_1, MyInteger plusInt_2) {
        this.myInteger_1 = plusInt_1;
        this.myInteger_2 = plusInt_2;
    }

    //  "Main-function" of the class.
    @Override
    public void combine() {
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
    public void combine() {
        this.myInteger_1.minus(this.myInteger_2.getValue());
    }

    //  The opposite of the "main-function".
    @Override
    public void undo() {
        this.myInteger_1.plus(this.myInteger_2.getValue());
    }

}
