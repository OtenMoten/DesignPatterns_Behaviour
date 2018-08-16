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
public class Client {

    public static void main(String[] args) {

        //  Create a book-list.
        IList<Book> myList = new BestSellerList<>();
        //  Add some books to the list.
        myList.getList().add(new Book("Harry Potter"));
        myList.getList().add(new Book("Deep Coding"));
        myList.getList().add(new Book("Kryptowährungen einfach erklärt!"));

        //  Create a iterator out of the book-list.
        InterfaceIterable<Book> myIterator = myList.createIterator();

        //  Only use the iterator to gain access to the elements in the list.
        while (!myIterator.isFinished()) {
            myIterator.next();
            System.out.println(myIterator.currentElement());
        }

    }

}
