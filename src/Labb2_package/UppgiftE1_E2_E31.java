package Labb2_package;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by David on 07-Nov-16.
 */

public class UppgiftE1_E2_E31 extends JFrame implements ActionListener{
    private MyButton myButton;

    public void actionPerformed(ActionEvent e) {
        myButton.toggleState();
    }

    public UppgiftE1_E2_E31() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.myButton = new MyButton();
        myButton.addActionListener(this);

        add(myButton);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new UppgiftE1_E2_E31();

    }
}