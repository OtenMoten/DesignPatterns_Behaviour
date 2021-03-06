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
public class Selector {

    ILanguage myLanguage;

    void setSprache(ILanguage newLanguage) {
        this.myLanguage = newLanguage;
    }

    String sayHello() {
        return myLanguage.getHello();
    }

}
