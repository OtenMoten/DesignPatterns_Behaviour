/**
 * In this package you will learn how to compare different lists.
 *
 * Enjoy the course and feel free to contribute.
 */
package Strategy_Comparison;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Car implements Comparable<Car> {

    private final String carName;

    public Car(String newName) {
        this.carName = newName;
    }

    public String getName() {
        return this.carName;
    }

    @Override
    public int compareTo(Car otherCar) {

        if (this.getName().equals(otherCar.getName())) {
            return 1;
        }

        if (!this.getName().equals(otherCar.getName())) {
            return -1;
        }

        return 0;

    }

}
