import javax.swing.JOptionPane;

public class exec58 {
    public static void main(String[] args) {
        float salario_bruto = Float.parseFloat(JOptionPane.showInputDialog("Insira o salário bruto:"));
        float prestacao = Float.parseFloat(JOptionPane.showInputDialog("Insira a prestação:"));

        if (prestacao > salario_bruto * 0.3f) {
            JOptionPane.showMessageDialog(null, "Não é possível fazer o empréstimo.");
        } else {
            JOptionPane.showMessageDialog(null, "É possível fazer o empréstimo.");
        }
    }
}
