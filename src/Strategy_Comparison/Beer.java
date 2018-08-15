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
public class Beer implements Comparable<Beer> {

    private final String beerName;

    public Beer(String name) {
        this.beerName = name;
    }

    public String getName() {
        return this.beerName;
    }

    @Override
    public String toString() {
        return this.beerName;
    }

    @Override
    public int compareTo(Beer anotherBeer) {

        if (this.getName().equals(anotherBeer.getName())) {
            return 1;
        }

        if (!this.getName().equals(anotherBeer.getName())) {
            return -1;
        }

        return 0;

    }

}
