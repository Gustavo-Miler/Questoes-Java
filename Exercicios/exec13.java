import javax.swing.JOptionPane;

public class exec13 {
    public static void main(String[] args) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor:"));
        double base = Double.parseDouble(JOptionPane.showInputDialog("Insira uma base:"));
        JOptionPane.showMessageDialog(null, "O log resultante é: " + (Math.log(valor) / Math.log(base)));
    }
}
