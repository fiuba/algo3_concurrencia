import javax.swing.*;
import java.awt.event.*;

public class Contador1 extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton contarButton;
    private JLabel cuentaLabel;

    public Contador1() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);


        //Agregamos el manejador de eventos que permita contar
        BotonContarEventHandler botonContarEventHandler = new BotonContarEventHandler(cuentaLabel);
        contarButton.addActionListener(botonContarEventHandler);
    }

    public static void main(String[] args) {
        Contador1 dialog = new Contador1();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
