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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Beer> listOfBeers_Alpha = new ArrayList<>();

        listOfBeers_Alpha.add(new Beer("Corona"));
        listOfBeers_Alpha.add(new Beer("Radeberger"));
        listOfBeers_Alpha.add(new Beer("Veltins"));

        List<Beer> listOfBeers_Beta = new ArrayList<>();

        listOfBeers_Beta.add(new Beer("Corona"));
        listOfBeers_Beta.add(new Beer("Hasseroeder"));
        listOfBeers_Beta.add(new Beer("Warsteiner"));

        System.out.println();

        //  Sort the lists.
        Collections.sort(listOfBeers_Alpha);
        Collections.sort(listOfBeers_Beta);

        System.out.println("Current alpha beer list:");
        listOfBeers_Alpha.forEach((beerElementAlpha) -> {
            System.out.println(beerElementAlpha);
        });

        System.out.println("Current beta beer list:");
        listOfBeers_Beta.forEach((beerElementBeta) -> {
            System.out.println(beerElementBeta);
        });

        System.out.println();

        System.out.println("Equal pattern: ");
        listOfBeers_Alpha.forEach((beerElement) -> {
            listOfBeers_Beta.forEach((anotherBeerElement) -> {
                if (beerElement.compareTo(anotherBeerElement) == 1) {
                    System.out.println(beerElement.getName());
                    System.out.println(anotherBeerElement.getName());
                }

            });
        });

    }

}
