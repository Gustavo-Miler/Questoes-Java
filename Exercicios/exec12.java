import javax.swing.JOptionPane;

public class exec12 {
    public static void main(String[] args) {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor:"));
        JOptionPane.showMessageDialog(null, "O log de base 10 de " + num + " é " + Math.log10(num));
    }
}
