import javax.swing.JOptionPane;

public class exec25 {
    public static void main(String[] args) {
        float p1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o p1:"));
        float p2 = Float.parseFloat(JOptionPane.showInputDialog("Insira o p2:"));
        JOptionPane.showMessageDialog(null, "A média arredondada é: " + Math.round((p1 + p2)/2));
    }
}
