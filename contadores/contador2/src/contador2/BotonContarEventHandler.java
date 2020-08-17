package contador2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonContarEventHandler implements ActionListener {

    private JLabel lblCuenta;

    public BotonContarEventHandler(JLabel label){
        this.lblCuenta = label;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        ContadorThread hiloContador = new ContadorThread(lblCuenta);
        hiloContador.start();
    }
}
