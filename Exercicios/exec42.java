import javax.swing.JOptionPane;

public class exec42 {
    public static void main(String[] args) {
        int peso = Integer.parseInt(JOptionPane.showInputDialog("Insira o peso (valor inteiro):"));
        int pesog = peso * 1000;
        JOptionPane.showMessageDialog(null, "Peso (g): " + pesog + "\nNovo peso (g):" + pesog * 1.2f);
    }
}
