import javax.swing.JOptionPane;

public class exec10 {
    public static void main(String[] args) {
        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o primeiro valor (Peso = 1):"));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Insira o primeiro valor (Peso = 2):"));
        float num3 = Float.parseFloat(JOptionPane.showInputDialog("Insira o primeiro valor (Peso = 3):"));
        float num4 = Float.parseFloat(JOptionPane.showInputDialog("Insira o primeiro valor (Peso = 4):"));

        JOptionPane.showMessageDialog(null, "A média ponderada é: " + ((num1 + num2 * 2 + num3 * 3 + num4 * 4) / 10));
    }
}
