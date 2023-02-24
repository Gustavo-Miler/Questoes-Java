//PRIMEIRO DE TUDO:
//Importar a biblioteca JOptionPane
import javax.swing.JOptionPane;

//Criar a class do arquivo
public class ExemploGeral {
    //Criar a função principal
    public static void main(String[] args) {
        //Com o JOptionPane vamos usar principalmente dois de seus métodos.
        //JOptionPane.showMessageDialog ----> Exibir mensagem ao usuário
        //JOptionPane.showInputDialog ------> Receber input do usuário

        //O JOptionPane.showMessageDialog recebe dois argumentos, não esqueça de sempre botar o 'null' antes da mensagem
        //Só deus sabe oq é esse null, oq importa é que ele é obrigatório antes da mensagem.
        //Fica assim: JOptionPane.showMessageDialog(null, "Mensagem aqui!!");
        //Para realizar quebra de linha no java basta usar \n, exemplo: JOptionPane.showMessageDialog(null, "essa é a linha1" + "\nEssa é a linha2");

        //Exemplo
        JOptionPane.showMessageDialog(null, "Este é um exemplo.");

        //O JOptionPane.showInputDialog recebe um argumento de String que vai ser a mensagem a ser exibida ao usuário
        //e vai retornar o valor que o usuário inseriu como String!!!!
        //Ao atribuir esse método a uma variável certifique-se de converter o valor de String para o valor desejado SEMPRE!

        //Para converter usamos o "parse"
        //Para inteiros usamos o Integer.parseInt(valor a ser convertido)
        //Para floats usamos o Float.parseFloat(idem)
        //Para doubles usamos Double.parseDouble(idem)
        //Etc etc tu entendeu, primeiro o tipo da variável depois a função parse + Tipo()
        //Tipo.parseTipo()

        //Exemplos
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade:"));

        float real = Float.parseFloat(JOptionPane.showInputDialog("Insira um valor real:"));

        //Se a sua variável já for uma string não precisa converter
        String nome = JOptionPane.showInputDialog("Insira seu nome:");

        //Isso é basicamente o que a gente vai usar em todas as atividades para receber input do usuário
        //e exibir mensagens.
        //Tmj best

    }
}
