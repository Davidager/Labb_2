package Labb2_package;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by David on 07-Nov-16.
 */

public class UppgiftE32 extends JFrame{
    public UppgiftE32(){
        MyButtonE32 myButton;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myButton = new MyButtonE32();
        add(myButton);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new UppgiftE32();
    }
}