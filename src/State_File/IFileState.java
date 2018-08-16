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
public interface IFileState {

    public abstract void open(File myFile);

    public abstract void close(File myFile);

    public abstract void delete(File myFile);

}
