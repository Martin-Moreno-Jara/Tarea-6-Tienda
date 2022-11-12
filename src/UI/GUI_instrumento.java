package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_instrumento extends JFrame{
    private JRadioButton instrumentosDeCuerdaRadioButton;
    private JRadioButton instrumentosDeVientoRadioButton;
    private JRadioButton instrumentoDePercusiónRadioButton;
    private JButton siguienteButton;
    private JButton anteriorButton;
    private JPanel panelinstrumentos;

    public GUI_instrumento(){
        super("Este es un mensaje de error");
        this.setContentPane(panelinstrumentos);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

        anteriorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI interfaz_producto = new GUI();
                panelinstrumentos.setVisible(false);
                JPanel panel_anterior = interfaz_producto.getPanelmain();
                panel_anterior.setVisible(true);
                setContentPane(panel_anterior);

            }
        });
    }
}
