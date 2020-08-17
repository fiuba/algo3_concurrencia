package contador3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonContar3EventHandler implements ActionListener {

    private JLabel lblCuenta;

    public BotonContar3EventHandler(JLabel cuentaLabel) {
        this.lblCuenta = cuentaLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Thread(new ContadorRunnable(lblCuenta)).start();
    }
}
