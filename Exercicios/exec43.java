import javax.swing.JOptionPane;

public class exec43 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número entre 0 e 60:"));
        JOptionPane.showMessageDialog(null, "o seu sucessor é: " + (num + 1) % 61);
        }
}
