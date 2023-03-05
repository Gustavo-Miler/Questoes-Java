import javax.swing.JOptionPane;

public class exec66 {
    public static void main(String[] args) {
        float valores[] = {0, 0, 0};
        for (int i = 0; i < 3; i++) {
            valores[i] = Float.parseFloat(JOptionPane.showInputDialog("Insira um número:"));
        }
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                float temp = 0;
                if (valores[i] > valores[j]) {
                    temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;
                }
            }
        }
        float menor = valores[0];
        float intermediario = valores[1];
        float maior = valores[2];
        
        JOptionPane.showMessageDialog(null, "Menor: " + menor + "\nIntermediário: " + intermediario + "\nMaior: " + maior);
    }
}
