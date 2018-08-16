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

class MP3Library<ClassType> implements IPlaylist<ClassType> {

    private final ArrayList<ClassType> myPlaylist;

    public MP3Library() {
        this.myPlaylist = new ArrayList<>();
    }

    @Override
    public ArrayList<ClassType> getPlaylist() {
        return this.myPlaylist;
    }

    @Override
    public InterfaceIterable<ClassType> createIterator() {
        return new Iterator(this.myPlaylist);
    }

    @Override
    public void play(ClassType playlist) {
        System.out.println(playlist.toString());
    }
    
}
