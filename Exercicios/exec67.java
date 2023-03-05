import javax.swing.JOptionPane;

public class exec67 {
    public static void main(String[] args) {
        float a = Float.parseFloat(JOptionPane.showInputDialog("Lado A:"));
        float b = Float.parseFloat(JOptionPane.showInputDialog("Lado B:"));
        float c = Float.parseFloat(JOptionPane.showInputDialog("Lado C:"));

        String tipo;
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && a == c) {
                tipo = "Equilátero";
            } else if (a == b || a == c || b == c) {
                tipo = "Isósceles";
            } else {
                tipo = "Escaleno";
            }
            JOptionPane.showMessageDialog(null, "O triângulo é do tipo " + tipo);
        } else {
            JOptionPane.showMessageDialog(null, "Não é um triângulo.");
        }
    }
}
