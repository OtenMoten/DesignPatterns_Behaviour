/**
 * In this package you will learn how to deal with access on elements.
 * The keypoint of the "Iterator"-pattern is that it offers the possibility to
 * gain access on specific elements without uncover the structure or the inner
 * state of the elements.
 *
 * Enjoy the course and feel free to contribute.
 */
package Iterator_MusicLibrary;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.ArrayList;

interface IPlaylist<ClassType> {

    InterfaceIterable<ClassType> createIterator();

    ArrayList<ClassType> getPlaylist();

    void play(ClassType playList);

}
