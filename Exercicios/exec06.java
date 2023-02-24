import javax.swing.JOptionPane;

public class exec06 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número:"));

        JOptionPane.showMessageDialog(null, "Produto: " + (num1 * num2));
    }
}
