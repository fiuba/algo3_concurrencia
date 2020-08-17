package contador3;

import sun.plugin2.message.Message;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonSaludarEventHandler implements ActionListener {

    private JTextField txtNombre;

    public BotonSaludarEventHandler(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, txtNombre.getText(), "Saludo", JOptionPane.INFORMATION_MESSAGE);
        txtNombre.setText("");
    }
}
