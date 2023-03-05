import javax.swing.JOptionPane;

public class exec16 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Insira um número:");
        String inum = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            inum += num.charAt(i);
        }
        JOptionPane.showMessageDialog(null, num + "\n" + inum);
    }
}
