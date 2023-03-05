import javax.swing.JOptionPane;

public class exec19 {
    public static void main(String[] args) {
        float b = Float.parseFloat(JOptionPane.showInputDialog("Insira a base:"));
        float a = Float.parseFloat(JOptionPane.showInputDialog("Insira a altura:"));

        JOptionPane.showMessageDialog(null, "Perímetro: " + (a * 2 + b * 2) + "\nÁrea: " + a*b + "\nDiagonal: " + Math.sqrt(a*a + b*b));
    }
}
