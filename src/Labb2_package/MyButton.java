package Labb2_package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by David on 07-Nov-16.
 */
public class MyButton extends JButton{
    private Color col1;
    private Color col2;
    private String text1;
    private String text2;
    private int stateVar;

    /*public int getState() {
        return stateVar;
    }*/

    public void toggleState() {
        if (stateVar == 1) {
            setBackground(col2);
            setText(text2);
            stateVar = 2;
        } else {
            setBackground(col1);
            setText(text1);
            stateVar = 1;
        }
    }

    MyButton(Color col1, Color col2, String text1, String text2) {
        this.col1 = col1;
        this.col2 = col2;
        this.text1 = text1;
        this.text2 = text2;
        this.stateVar = 1;    // sätter i tillstånd 1
        setBackground(col1);
        setText(text1);
    }

    MyButton() {
        this(Color.GREEN, Color.BLUE, "En grön knapp", "En svart knapp");
    }

}
