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
public class File {

    private IFileState fileState = null;
    private String fileName = null;

    public File(String filename) {
        this.fileName = filename;
        //  Initial state is 'closed'.
        this.fileState = new ClosedState();
    }

    public void open() {
        this.fileState.open(this);
    }

    public void close() {
        this.fileState.close(this);
    }

    public void delete() {
        this.fileState.delete(this);
    }

    public void setStatus(IFileState state) {
        this.fileState = state;
    }

}
