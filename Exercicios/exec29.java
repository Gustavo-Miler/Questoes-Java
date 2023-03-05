import javax.swing.JOptionPane;

public class exec29 {
    public static void main(String[] args) {
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do produto:"));
        JOptionPane.showMessageDialog(null, "O valor com desconto de 9% é: " + valor * 0.91f);
    }
}
