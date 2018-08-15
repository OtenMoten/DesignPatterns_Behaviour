/**
 * In this package you will learn how to create and use your own actionlistener.
 *
 * Enjoy the course and feel free to contribute.
 */
package Observer_ActionListener;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Observer extends Frame implements ActionListener {

    Button btnAlpha = new Button("Alpha");
    Button btnBeta = new Button("Beta");

    public Observer() {

        //  We can directly create our GUI in this class with
        //  the keyword "super". Withit we can access the function of
        //  the parent-class "Frame", which is possible for the GUI optic.
        super.setTitle("Beobachter GUI Beispiel");
        super.setSize(500, 100);
        super.setLocation(400, 400);
        super.setLayout(new FlowLayout());
        //  We can add as parameter "this" because our class "Observer" impelements the
        //  interface "ActionListener", and the function needs a ActionListener-object
        //  as input-parameter.
        btnAlpha.addActionListener(this);
        // Add our own created actionlistener.
        btnBeta.addActionListener(new UserActionListener());

        super.add(btnAlpha);
        super.add(btnBeta);

        super.setVisible(true);

    }

    @Override
    //  This function is for the Alpha-button. It overrides the parent-function of
    //  the parent-interface "ActionListener".
    public void actionPerformed(ActionEvent actionEventObject) {
        //  Generate a random background color each time 
        //  the button is clicked.
        this.setBackground(new Color(new Random().nextInt()));
        System.out.println("Done.");
    }

}
