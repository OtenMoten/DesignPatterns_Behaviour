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
public class MusicPlayer {

    public static void main(String[] args) {

        IPlaylist<Track> myPlaylist = new MP3Library<>();
        myPlaylist.getPlaylist().add(new Track("Track 1"));
        myPlaylist.getPlaylist().add(new Track("Track 2"));
        myPlaylist.getPlaylist().add(new Track("Track 3"));

        InterfaceIterable<Track> myIterator = myPlaylist.createIterator();

        while (!myIterator.isFinished()) {
            myIterator.next();
            myPlaylist.play(myIterator.currentElement());
        }

    }

}
