/**
 * In this package you will learn how to deal with access on elements.
 * The keypoint of the "Iterator"-pattern is that it offers the possibility to
 * gain access on specific elements without uncover the structure or the inner
 * state of the elements.
 *
 * Enjoy the course and feel free to contribute.
 */
package Iterator_BestSeller;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.ArrayList;

class Iterator<ClassType> implements InterfaceIterable<ClassType> {

    private int position = -1;
    private final ArrayList<ClassType> myList;

    public Iterator(ArrayList<ClassType> newList) {
        this.myList = newList;
    }

    @Override
    public void start() {
        this.position = 0;
    }

    @Override
    public void next() {
        if (!isFinished()) {
            this.position++;
        }
    }

    @Override
    public boolean isFinished() {
        return this.position >= this.myList.size() - 1;
    }

    @Override
    public ClassType currentElement() {
        return this.myList.get(this.position);
    }

}
