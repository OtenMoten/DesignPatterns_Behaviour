/**
 * In this package you will learn how to track and trace operations within the code
 * on hand with the "Observer" behaviour design pattern.
 *
 * Enjoy the course and feel free to contribute.
 */
package Observer_Watchdogs;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
interface ISubject {

    public abstract void addObserver(AObserver newOberserver);

    public abstract void removeObserver(AObserver oberserver);

    public abstract void notifyAllObservers();
}
