import javax.swing.JOptionPane;

public class exec07 {
    public static void main(String[] args) {
        float num = Float.parseFloat(JOptionPane.showInputDialog("Insira um número real:"));

        JOptionPane.showMessageDialog(null, "A terça parte de " + num + " é: " + (num / 3));
    }
}
