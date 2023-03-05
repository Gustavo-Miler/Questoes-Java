import javax.swing.JOptionPane;

public class exec48 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira uma conta com 3 dígitos:"));
        int rev = 0;
        for (int i = num; i != 0; i /= 10) {
            int resto = i % 10;
            rev = rev * 10 + resto;
        }
        num += rev;
        int soma = 0;
        for (int i = num; i != 0; i /= 10) {
            int resto = i % 10;
            soma += resto * String.valueOf(i).length();
        }
        JOptionPane.showMessageDialog(null, "O dígito verificador é: " + soma % 10);
    }
}
