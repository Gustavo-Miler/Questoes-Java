import javax.swing.JOptionPane;

public class exec50 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
        if (num > 0) {
            int rev = 0;
            for (int i = num; i != 0; i /= 10) {
                int resto = i % 10;
                rev = rev * 10 + resto;
            }
            JOptionPane.showMessageDialog(null, "O seu inverso é: " + rev);
        } else {
            JOptionPane.showMessageDialog(null, "O seu absoluto é: " + Math.abs(num));
        }
    }
}
