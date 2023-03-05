import javax.swing.JOptionPane;

public class exec15 {
    public static void main(String[] args) {
        float saldo = Float.parseFloat(JOptionPane.showInputDialog("Insira o saldo:"));
        JOptionPane.showMessageDialog(null, "O novo saldo com reajuste é: " + (saldo * 1.01));
    }
}
