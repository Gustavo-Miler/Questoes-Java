import javax.swing.JOptionPane;

public class exec76 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o A."));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o B."));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Insira o C."));
        
        if (a != 0) {
            double delta = b * b - 4 * a * c;
            if (delta >= 0) {
                double x1 = (Math.sqrt(delta) - b) / 2 * a;
                double x2 = (-Math.sqrt(delta) - b) / 2 * a;
                JOptionPane.showMessageDialog(null, "X1: " + x1 + "\nX2: " + x2);
            } else {
                JOptionPane.showMessageDialog(null, "Não há raízes reais.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não é equação do segundo grau.");
        }
    }
}
