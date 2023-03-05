import javax.swing.JOptionPane;

public class exec30 {
    public static void main(String[] args) {
        float valor_hora_aula = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da hora aula:"));
        int quantidade_aulas = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de aulas dadas no mês:"));
        float percentual = Float.parseFloat(JOptionPane.showInputDialog("Insira o percentual do INSS (no formato 0.00):"));

        JOptionPane.showMessageDialog(null, "Salário liquido: " + valor_hora_aula * quantidade_aulas * (1.f - percentual));
    }
}
