import javax.swing.JOptionPane;

public class exec77 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Insira o nome do município:");
        int eleitores = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de eleitores aptos:"));
        int quantidade_votos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de votos do candidato mais votado:"));

        if (eleitores > 20000 && quantidade_votos / eleitores >= 0.5) {
            JOptionPane.showMessageDialog(null, "O município de " + nome + " terá segundo turno.");
        } else {
            JOptionPane.showMessageDialog(null, "O município de " + nome + " não terá segundo turno.");
        }
    }
}
