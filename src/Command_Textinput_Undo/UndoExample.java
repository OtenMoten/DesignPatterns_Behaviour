/**
 * Author:  Kevin Ossenbrück
 * Date:    August 2018
 *
 * In this package you will learn how to manage a undo-function related to
 * a user-input on a keyboard.
 *
 * Enjoy and feel free to contribute.
 */
package Command_Textinput_Undo;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.undo.UndoManager;

public class UndoExample {

    public static void main(String[] args) {

        //  Create a object of the "UndoManager"-class.
        //  We use the manager from the Swing-library (javax.swing.undo.UndoManager)-
        UndoManager undomanager = new UndoManager();

        //  Create a frame and
        JFrame mainFrame = new JFrame();
        //  a textarea and
        final JTextArea textarea = new JTextArea(5, 10);
        //  a button.
        JButton undoB = new JButton("Undo");

        //  Define the frame's attributes.
        mainFrame.setLocation(300, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //  Set up the initial text of the textarea.
        textarea.setText("X");
        //  Define the textarea's attributes, like the style-type and size.
        textarea.setFont(new Font("Helvetica", 0, 40));
        //  Install a action-listener on the button.
        undoB.addActionListener((ActionEvent e) -> {
            //  Check if history is not empty.
            if (undomanager.canUndo()) {
                //  Undo last action.
                undomanager.undo();
                System.out.println("The button: '" + e.getActionCommand() + "' has pushed.");
            }
            //  Switch the cursor back in the textarea.
            textarea.requestFocus();
        });

        //  Put the textarea and
        mainFrame.add(textarea);
        //  the button in the frame.
        mainFrame.add(undoB, BorderLayout.SOUTH);

        //  Add a listener in the textarea.
        //  The keyword here is the "UndoableEditListener".
        //  Because the textarea is supporting a function where we can add
        //  a listener like our undomanager-object.
        //  The undomanager-object is type of the "UndoManger"-class which
        //  implements the "UndoableEditListener"-interface.
        textarea.getDocument().addUndoableEditListener(undomanager);
        //  Set up the maximal count of the history.
        undomanager.setLimit(120);

        //  Start the program. 
        mainFrame.pack();
        mainFrame.setVisible(true);

    }

}