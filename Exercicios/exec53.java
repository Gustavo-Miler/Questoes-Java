import javax.swing.JOptionPane;

public class exec53 {
    public static void main(String[] args) {
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Insira o seu peso:"));
        String escolha = JOptionPane.showInputDialog("Escolha um planeta:\nMercúrio (a)\nVênus (b)\nMarte (c)\nJúpiter (d)\nSaturno (e)\nUrano (f)");
        switch (escolha) {
            case "a": JOptionPane.showMessageDialog(null, "O seu peso em mercúrio seria: " + peso * 0.37f + "kg"); break;
            case "b": JOptionPane.showMessageDialog(null, "O seu peso em vênus seria: " + peso * 0.88f + "kg"); break;
            case "c": JOptionPane.showMessageDialog(null, "O seu peso em marte seria: " + peso * 0.38f + "kg"); break;
            case "d": JOptionPane.showMessageDialog(null, "O seu peso em júpiter seria: " + peso * 2.64f + "kg"); break;
            case "e": JOptionPane.showMessageDialog(null, "O seu peso em saturno seria: " + peso * 1.15f + "kg"); break;
            case "f": JOptionPane.showMessageDialog(null, "O seu peso em urano seria: " + peso * 1.17f + "kg"); break;
            default: JOptionPane.showMessageDialog(null, "Resposta inválida.");
        }
    }
}
