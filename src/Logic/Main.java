package Logic;

import UI.*;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


public class Main extends Instancias {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        GUI gui = new GUI();
        gui.setVisible(true);

    }
}