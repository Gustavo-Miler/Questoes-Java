import javax.swing.JOptionPane;

public class exec40 {
    public static void main(String[] args) {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor real:"));
        int parte_inteira = (int)num;
        double parte_frac = num - (double)parte_inteira;
        double arredondado = num - parte_frac;

        JOptionPane.showMessageDialog(null, "Parte inteira: " + parte_inteira + "\nParte fracionada: " + parte_frac + "\nValor arredondado: " + arredondado);
    }
}
