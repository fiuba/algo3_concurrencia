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
        int contador = 0;

        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            contador++;
            lblCuenta.setText(String.valueOf(contador));
        }
    }
}
