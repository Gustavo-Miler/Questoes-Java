import javax.swing.JOptionPane;

public class exec37 {
    public static void main(String[] args) {
        float valor_gasto = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor gasto:"));
        JOptionPane.showMessageDialog(null, "Valor com 10%: " + valor_gasto * 1.1f);
    }
}
