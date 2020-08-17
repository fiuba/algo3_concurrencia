package contador3;

import javax.swing.*;

public class ContadorRunnable implements Runnable {

    private JLabel lblCuenta;

    public ContadorRunnable(JLabel lblCuenta) {
        this.lblCuenta = lblCuenta;
    }

    @Override
    public void run() {
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
