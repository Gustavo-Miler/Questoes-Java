import javax.swing.JOptionPane;

public class exec3 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
        
        JOptionPane.showMessageDialog(null, "O antecessor de " + num + " é: " + (num - 1));
        JOptionPane.showMessageDialog(null, "O sucessor de " + num + " é: " + (num + 1));
    }
}
