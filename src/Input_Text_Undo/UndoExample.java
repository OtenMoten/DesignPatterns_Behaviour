/**
 * In this package you will learn how to manage a undo-function related to
 * a user's input on a keyboard.
 * We will use a specific "UndoManager"-library.
 * (import javax.swing.undo.*)
 *
 * Enjoy the course and feel free to contribute.
 */
package Input_Text_Undo;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.undo.UndoManager;

public class UndoExample {

    public static void main(String[] args) {

        //  Create a object of the "UndoManager"-class.
        //  We use the manager from the Swing-library (javax.swing.undo.UndoManager).
        UndoManager undomanager = new UndoManager();

        //  Create a frame and
        JFrame mainFrame = new JFrame();
        //  a textarea and
        final JTextArea textarea = new JTextArea(5, 10);
        //  a button.
        JButton btnUndo = new JButton("Undo");

        //  Define the GUI elements' attributes.
        mainFrame.setLocation(300, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textarea.setText("Type here ...");
        textarea.setFont(new Font("Helvetica", 0, 40));
        //  Add a listener in the textarea.
        //  The keyword here is the "UndoableEditListener".
        //  Because the textarea is supporting a function where we can add
        //  a listener like our undomanager-object.
        //  The undomanager-object is type of the "UndoManger"-class which
        //  implements the "UndoableEditListener"-interface.
        textarea.getDocument().addUndoableEditListener(undomanager);
        //  Set up the maximal count of the history.
        undomanager.setLimit(120);

        //  Install a action-listener on the button.
        btnUndo.addActionListener((ActionEvent actionEvent) -> {
            //  Check if history is not empty.
            if (undomanager.canUndo()) {
                //  Undo last action.
                undomanager.undo();
                System.out.println("The button: '" + actionEvent.getActionCommand() + "' has been clicked.");
            }
            //  Switch the cursor back in the textarea.
            textarea.requestFocus();
        });

        //  Put the textarea and
        mainFrame.add(textarea);
        //  the button into the frame.
        mainFrame.add(btnUndo, BorderLayout.SOUTH);

        //  Start the program. 
        mainFrame.pack();
        mainFrame.setVisible(true);

    }

}
