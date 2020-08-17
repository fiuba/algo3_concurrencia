package contador2;

import javax.swing.*;

public class ContadorThread extends Thread {

    private JLabel lblCuenta;

    public ContadorThread(JLabel label){
        lblCuenta = label;
    }

    @Override
    public void run(){
        int contador = 0;

        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            contador++;
            lblCuenta.setText(String.valueOf(contador));
        }
    }
}
