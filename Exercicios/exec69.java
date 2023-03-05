import javax.swing.JOptionPane;

public class exec69 {
    public static void main(String[] args) {
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Insira o seu salário:"));
        float desconto;
        if (salario <= 600) {
            desconto = 0;
        } else if (salario <= 1200) {
            desconto = 0.2f;
        } else if (salario <= 2000) {
            desconto = 0.25f;
        } else {
            desconto = 0.3f;
        }
        JOptionPane.showMessageDialog(null, "Desconto do INSS: " + desconto * 100 + "%\nSeu salário com desconto: " + salario * (1 - desconto) + "R$");
    }
}
