package Labb2_package;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by David on 07-Nov-16.
 */

public class UppgiftE1 implements ActionListener{
    public UppgiftE1() {
        JFrame myFrame = new JFrame("Knappt");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyButton myButton = new MyButton();

        myButton.addActionListener(new MyListener());


        myFrame.add(myButton);
        myFrame.pack();
        myFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        myButton.toggleState();
    }
    public static void main(String[] args) {
        UppgiftE1 myExample = new UppgiftE1();
    }
}