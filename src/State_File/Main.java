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
public class Main {

    public static void main(String[] args) {

        //  Create a new file.
        File myFile = new File("Alpha");
        System.out.println();

        //  Open the file twice.
        myFile.open();
        myFile.open(); //   Watch the output in the console.
        System.out.println();

        //  Delete a open file.
        myFile.delete(); // It's not possible.
        myFile.close(); //  Close the file at first and
        myFile.delete();//  then delete it.
        System.out.println();
    }

}
