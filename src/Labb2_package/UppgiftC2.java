package Labb2_package;
import Labb2_package.knapppaket.MyButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by David on 08-Nov-16.
 */
public class UppgiftC2 extends JFrame implements ActionListener {
    private MyButton[] buttonArray;

    public void actionPerformed(ActionEvent e) {
        MyButton pressedButton = (MyButton)e.getSource();
        for(MyButton item : buttonArray) {
            if (item != pressedButton) {
                item.toggleState();
            }
        }
    }
    public UppgiftC2(int numberOfButtons){
        buttonArray = new MyButton[numberOfButtons];
        for(int i=1; i<numberOfButtons+1; i++){
            buttonArray[i-1] = new MyButton();
            add(buttonArray[i-1]);
            buttonArray[i-1].addActionListener(this);
        }        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new GridLayout(0,10));
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        int numberOfButtons = 2;  //utgångsavärde om ingen input ges
        try{
            numberOfButtons = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {   // ifall ingen input ges händer inget med numberOfButtons
        } catch (NumberFormatException e) {
            System.out.println("Wrong input!");
            System.exit(0);
        }
        UppgiftC2 frame = new UppgiftC2(numberOfButtons);


    }
}