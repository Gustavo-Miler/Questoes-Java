import javax.swing.JOptionPane;

public class exec18 {
    public static void main(String[] args) {
        String nome_completo = JOptionPane.showInputDialog("Insira um nome completo:");
        char[] nome = nome_completo.toCharArray();
        String nome_modificado = "";
        for (int i = 0; i < nome.length; i++) {
            if (i > 0 && i < nome.length - 2) {
                nome_modificado += nome[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Nome completo: " + nome_completo +
                                                             "\nPrimeiro caractere: " + nome[0] +
                                                             "\nÚltimo caractere: " + nome[nome.length - 1] +
                                                             "\nPrimeiro ao terceiro caractere: " + nome[0] + nome[1] + nome[2] +
                                                             "\nQuarto caractere: " + nome[3] +
                                                             "\nTodos menos o primeiro e dois últimos: " + nome_modificado);
    }
}