import javax.swing.JOptionPane;

public class exec09 {
    public static void main(String[] args) {
        int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Insira o dividendo:"));
        int divisor = Integer.parseInt(JOptionPane.showInputDialog("Insira o divisor:"));

        JOptionPane.showMessageDialog(null, "Dividendo: " + dividendo + "\nDivisor: " + divisor + "\nQuociente: " + (dividendo / divisor) + "\nResto: " + (dividendo % divisor));
    }
}
