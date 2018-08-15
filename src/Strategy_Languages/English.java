/**
 * In this package you will learn how to deal with the assortment of
 * different languages in a application.
 *
 * Enjoy the course and feel free to contribute.
 */
package Strategy_Languages;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class English implements ILanguage {

    String engHello = "Welcome!";

    @Override
    public String getHello() {
        return this.engHello;
    }

}
