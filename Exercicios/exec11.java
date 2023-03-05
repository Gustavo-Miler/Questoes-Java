import javax.swing.JOptionPane;

public class exec11 {
    public static void main(String[] args) {
        double angulo = Math.toRadians(Double.parseDouble(JOptionPane.showInputDialog("Insira um ângulo em graus:")));
        JOptionPane.showMessageDialog(null, "Seno: " + Math.sin(angulo) +
                                                             "\nCosseno: " + Math.cos(angulo) +
                                                             "\nTangente: " + Math.tan(angulo) +
                                                             "\nSecante: " + 1/Math.cos(angulo) +
                                                             "\nCossecante: " + 1/Math.sin(angulo) +
                                                             "\nCotangente: " + 1/Math.tan(angulo));
    }
}
