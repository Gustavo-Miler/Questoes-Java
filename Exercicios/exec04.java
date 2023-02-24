import javax.swing.JOptionPane;

public class exec04 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Insira um nome:");
        String endereco = JOptionPane.showInputDialog("Insira um endereço:");
        String telefone = JOptionPane.showInputDialog("Insira um telefone:");

        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone);
    }
}
