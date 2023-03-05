import javax.swing.JOptionPane;

public class exec35 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o inteiro A:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o inteiro B:"));
        int c = a;
        a = b;
        b = c;
        JOptionPane.showMessageDialog(null, "Valores trocados:\nA: " + a + "\nB: " + b);
    }
}
