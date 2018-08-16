/**
 * In this package you will learn how to manage different states of a object
 * while a running program.
 *
 * Enjoy the course and feel free to contribute.
 */
package State_File;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class ClosedState implements IFileState {

    public ClosedState() {
        System.out.println("Closed state initialized.");
    }

    @Override
    public void close(File myFile) {
        System.out.println("File is already closed.");
    }

    @Override
    public void delete(File myFile) {
        myFile.setStatus(new DeletedState());
        System.out.println("File is in transcendence state.");
    }

    @Override
    public void open(File myFile) {
        myFile.setStatus(new OpenState());
        System.out.println("File is open.");
    }

}
