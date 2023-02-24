import javax.swing.JOptionPane;

public class exec08 {
    public static void main(String[] args) {
        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o primeiro número real:"));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Insira o segundo número real:"));

        JOptionPane.showMessageDialog(null, "Média: " + ((num1 + num2) / 2));
    }
}
