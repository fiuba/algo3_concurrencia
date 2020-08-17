package contador3;

import contador2.BotonContarEventHandler;

import javax.swing.*;

public class Contador3 extends JDialog {
    private JPanel contentPane;
    private JButton contarButton;
    private JButton saludarButton;
    private JLabel cuentaLabel;
    private JTextField txtNombre;
    private JButton buttonOK;

    public Contador3() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        BotonContar3EventHandler botonContarEventHandler = new BotonContar3EventHandler(cuentaLabel);
        contarButton.addActionListener(botonContarEventHandler);

        BotonSaludarEventHandler botonSaludarEventHandler = new BotonSaludarEventHandler(txtNombre);
        saludarButton.addActionListener(botonSaludarEventHandler);
    }

    public static void main(String[] args) {
        Contador3 dialog = new Contador3();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
