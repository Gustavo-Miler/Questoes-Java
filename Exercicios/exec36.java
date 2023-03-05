import javax.swing.JOptionPane;

public class exec36 {
    public static void main(String[] args) {
        float num = Float.parseFloat(JOptionPane.showInputDialog("Insira o numerador:"));
        float den = Float.parseFloat(JOptionPane.showInputDialog("Insira o denominador:"));

        JOptionPane.showMessageDialog(null, "Fração para decimal: " + num / den);
    }
}
