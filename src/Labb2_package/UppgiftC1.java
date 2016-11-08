package Labb2_package;
import Labb2_package.knapppaket.MyButtonE32;
import javax.swing.*;
import java.awt.*;

/**
 * Created by David on 08-Nov-16.
 */
public class UppgiftC1 extends JFrame {
    public UppgiftC1(int numberOfButtons){
        MyButtonE32[] buttonArray = new MyButtonE32[numberOfButtons];
        for(int i=1; i<numberOfButtons+1; i++){
            buttonArray[i-1] = new MyButtonE32();
            add(buttonArray[i-1]);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        UppgiftC1 frame = new UppgiftC1(numberOfButtons);


    }
}