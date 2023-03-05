import javax.swing.JOptionPane;

public class exec79 {
    public static void main(String[] args) {
        float saldo_medio = Float.parseFloat(JOptionPane.showInputDialog("Insira o saldo mérdio:"));
        float credito;
        if (saldo_medio <= 500) {
            credito = 0;
        } else if (saldo_medio <= 1000) {
            credito = saldo_medio * 0.3f;
        } else if (saldo_medio <= 3000) {
            credito = saldo_medio * 0.4f;
        } else {
            credito = saldo_medio * 0.5f;
        }
        JOptionPane.showMessageDialog(null, "Saldo médio: " + saldo_medio + "\nCrédito disponibilizado: " + credito);
    }
}
