import javax.swing.JOptionPane;

public class exec14 {
    public static void main(String[] args) {
        float num = Float.parseFloat(JOptionPane.showInputDialog("Insira um valor:"));
        JOptionPane.showMessageDialog(null, "Número: " + num + "\nQuadrado: " + (num * num) + "\nRaíz Quadrada: " + Math.sqrt(num));
    }
}
