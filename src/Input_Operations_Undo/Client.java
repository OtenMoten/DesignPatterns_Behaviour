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
public class Client {

    public static void main(String args[]) {

        Calculator myCalc = new Calculator();
        MyInteger myInt_1 = new MyInteger(5);
        MyInteger myInt_2 = new MyInteger(4);
        Plus cmdPlusObject = new Plus(myInt_1, myInt_2);

        myCalc.invoke(cmdPlusObject); //    myInt_1 == 9
        System.out.println(myInt_1.getValue());

        myCalc.invoke(cmdPlusObject); //    myInt_1 == 13
        System.out.println(myInt_1.getValue());

        myCalc.invoke(cmdPlusObject); //    myInt_1 == 17
        System.out.println(myInt_1.getValue());

        myCalc.undo(); //   myInt_1 == 13
        System.out.println(myInt_1.getValue());

        myCalc.undo(); //   myInt_1 == 9
        System.out.println(myInt_1.getValue());
        System.out.println("Last operation-object in the stack is @ " + myCalc.operationStack.get(0));

        myCalc.undo(); //   myInt_1 == 5
        System.out.println("The initial state of the first variable in "
                + "the plus-operation-object is recovered. \n Proof: A = " + myInt_1.getValue());

        myCalc.undo(); //   Exception is throwed.

    }

}
