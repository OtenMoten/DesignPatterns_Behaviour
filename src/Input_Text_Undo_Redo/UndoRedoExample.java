/**
 * In this package you will learn how to manage a undo- and redo-function related
 * to a user's input on a keyboard.
 * We will use a specific "UndoManager"-library.
 * (import javax.swing.undo.*)
 *
 * Enjoy the course and feel free to contribute.
 */
package Input_Text_Undo_Redo;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.undo.UndoManager;

public class UndoRedoExample {

    public static void main(String[] args) {

        //  Create a object of the "UndoManager"-class.
        //  We use the manager from the Swing-library (javax.swing.undo).
        UndoManager undoRedomanager = new UndoManager();

        //  Create a frame and
        JFrame mainFrame = new JFrame();
        //  a textarea and 
        JTextArea textarea = new JTextArea(10, 20);
        //  two buttons.
        JButton btnUndo = new JButton("Undo");
        JButton btnRedo = new JButton("Redo");

        //  Define the GUI elements' attributes.
        mainFrame.setLocation(300, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textarea.setText("");
        textarea.setText("Type here ...");
        textarea.setFont(new Font("Helvetica", 0, 40));
        //  Add a listener in the textarea.
        //  The keyword here is the "UndoableEditListener".
        //  Because the textarea is supporting a function where we can add
        //  a listener like our undomanager-object.
        //  The undomanager-object is type of the "UndoManger"-class which
        //  implements the "UndoableEditListener"-interface.
        textarea.getDocument().addUndoableEditListener(undoRedomanager);
        //  Set up the maximal count of the history.
        undoRedomanager.setLimit(240);

        //  Create a action-listener for the undo-button.
        ActionListener undo = (ActionEvent actionEvent) -> {
            //  Check if history is not empty.
            if (undoRedomanager.canUndo()) {
                //  Undo last action.
                undoRedomanager.undo();
                System.out.println("The button: '" + actionEvent.getActionCommand() + "' has been clicked.");
            }
            //  Switch the cursor back in the textarea.
            textarea.requestFocus();
        };
        //  Create a action-listener for the redo-button.
        ActionListener redo = (ActionEvent actionEvent) -> {
            //  Check if history is not empty.
            if (undoRedomanager.canRedo()) {
                //  Redo last action.
                undoRedomanager.redo();
                System.out.println("The button: '" + actionEvent.getActionCommand() + "' has been clicked.");
            }
            //  Switch the cursor back in the textarea.
            textarea.requestFocus();
        };

        //  Install the listeners on the buttons and
        btnUndo.addActionListener(undo);
        btnRedo.addActionListener(redo);
        //  add the textarea to the frame.
        mainFrame.add(textarea);
        //  At least add the buttons to the frame.
        mainFrame.add(btnUndo, BorderLayout.WEST);
        mainFrame.add(btnRedo, BorderLayout.EAST);

        //  Start the program.
        mainFrame.pack();
        mainFrame.setVisible(true);

    }

}
