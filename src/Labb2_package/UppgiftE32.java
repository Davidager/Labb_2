package Labb2_package;
import Labb2_package.knapppaket.MyButtonE32;
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