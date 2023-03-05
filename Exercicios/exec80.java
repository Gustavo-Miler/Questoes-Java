import javax.swing.JOptionPane;

public class exec80 {
    public static void main(String[] args) {
        float dist = Float.parseFloat(JOptionPane.showInputDialog("Insira a distância do percurso em km:"));
        String car = JOptionPane.showInputDialog("Escolha um carro (a, b ou c):");
        switch (car) {
            case "a": JOptionPane.showMessageDialog(null, "O consumo estimado de combustível é de: " + dist / 8 + "L"); break;
            case "b": JOptionPane.showMessageDialog(null, "O consumo estimado de combustível é de: " + dist / 9 + "L"); break;
            case "c": JOptionPane.showMessageDialog(null, "O consumo estimado de combustível é de: " + dist / 12 + "L"); break;
            default: JOptionPane.showMessageDialog(null, "Resposta inválida.");
        }
    }
}
