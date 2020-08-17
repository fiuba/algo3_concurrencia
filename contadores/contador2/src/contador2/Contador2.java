package contador2;

import javax.swing.*;

public class Contador2 extends JDialog {
    private JPanel contentPane;
    private JButton contarButton;
    private JLabel cuentaLabel;
    private JButton buttonOK;

    public Contador2() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        BotonContarEventHandler botonContarEventHandler = new BotonContarEventHandler(cuentaLabel);
        contarButton.addActionListener(botonContarEventHandler);
    }

    public static void main(String[] args) {
        Contador2 dialog = new Contador2();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
