/**
 * In this package you will learn how to manage different states of a object
 * while a running program. It should seem to be that the object is changing
 * it's class-type while running. This is the keypoint of the "State"-pattern.
 *
 * Enjoy the course and feel free to contribute.
 */
package State_File;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class DeletedState implements IFileState {

    public DeletedState() {
        System.out.println("Transendence state initialized.");
    }

    @Override
    public void close(File myFile) {
        System.out.println("File can't be closed if in transendence state.");
    }

    @Override
    public void delete(File myFile) {
        myFile.setStatus(new DeletedState());
        System.out.println("File is already in transendence state.");
    }

    @Override
    public void open(File myFile) {
        myFile.setStatus(new OpenState());
        System.out.println("File is open now.");
    }

}
