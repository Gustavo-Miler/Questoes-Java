import javax.swing.JOptionPane;

public class exec32 {
    public static void main(String[] args) {
        float raio = Float.parseFloat(JOptionPane.showInputDialog("Insira o raio:"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Insira a altura:"));
        float volume = 3.14159f * raio * raio * altura;
        
        JOptionPane.showMessageDialog(null, "O volume é: " + volume);
    }
}
