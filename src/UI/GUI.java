package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JPanel PanelMain;
    private JRadioButton instrumentosMusicalesRadioButton;
    private JRadioButton accesoriosRadioButton;
    private JRadioButton paquetesEspecialesRadioButton;
    private JButton continuarButton;

    public GUI(){
        super("Tienda de instrumentos musicales");
        setContentPane(PanelMain);
        continuarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(instrumentosMusicalesRadioButton.isSelected()){
                    JPanel panel_instrumento = new JPanel();

                    setContentPane(panel_instrumento);
                    JOptionPane.showMessageDialog(null,"funciona para instrumentos musicales!!");
                }
                else if(accesoriosRadioButton.isSelected()){
                    JOptionPane.showMessageDialog(null,"funciona para accesorios!!");
                }
                else if(paquetesEspecialesRadioButton.isSelected()){
                    JOptionPane.showMessageDialog(null,"funciona para los paquetes!!");
                }
                else{
                    JOptionPane.showMessageDialog(null,"funciona para los paquetes!!","No selección",JOptionPane.ERROR_MESSAGE);

                }
            }
        });
    }


}
