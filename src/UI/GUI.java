package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI extends JFrame{
    private JRadioButton instrumentosMusicalesRadioButton;
    private JRadioButton accesoriosRadioButton;
    private JRadioButton paquetesEspecialesRadioButton;
    private JButton continuarButton;
    private JPanel panelproducto;
    private JPanel panelmain;

    public JPanel getPanelmain() {
        return panelmain;
    }

    public GUI(){
        super("Tienda música");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelmain);
        this.panelmain.setVisible(true);
        this.pack();
        continuarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(instrumentosMusicalesRadioButton.isSelected()){
                    GUI_instrumento interfaz_instrumento = new GUI_instrumento();
                    panelmain.setVisible(false);
                    setContentPane(interfaz_instrumento.getContentPane());

                }
            }
        });
    }

}
