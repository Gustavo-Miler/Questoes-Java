import javax.swing.JOptionPane;

public class exec2 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: "));

        JOptionPane.showMessageDialog(null, "O primeiro número é: " + num1);
        JOptionPane.showMessageDialog(null, "O segundo número é: " + num2);
    }
}
