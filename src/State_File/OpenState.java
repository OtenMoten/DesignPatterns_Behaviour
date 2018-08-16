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
public class OpenState implements IFileState {

    public OpenState() {
        System.out.println("Open state initialized.");
    }

    @Override
    public void close(File myFile) {
        myFile.setStatus(new ClosedState());
        System.out.println("File will be closed.");
    }

    @Override
    public void delete(File myFile) {
        System.out.println("Deleting failed. "
                + "Close the file first.");
    }

    @Override
    public void open(File myFile) {
        myFile.setStatus(new OpenState());
        System.out.println("File is already open.");
    }

}
