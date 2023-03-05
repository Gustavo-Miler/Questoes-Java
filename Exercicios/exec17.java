import javax.swing.JOptionPane;

public class exec17 {
    public static void main(String[] args) {
        float salario_minimo = Float.parseFloat(JOptionPane.showInputDialog("Insira o salário mínimo:"));
        float gasto_kw = Float.parseFloat(JOptionPane.showInputDialog("Insira o gasto de quilowatts:"));
        float valor_kw = salario_minimo / 700.f;
        float valor_pago = gasto_kw * valor_kw;
        float valor_com_desconto = valor_pago * 0.9f;

        JOptionPane.showMessageDialog(null, "Valor por quilowatt: " + valor_kw + "R$" +
                                                             "\nValor a ser pago: " + valor_pago + "R$" +
                                                             "\nValor pago com desconto: " + valor_com_desconto + "R$");
    }
}
