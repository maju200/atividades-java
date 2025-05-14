import javax.swing.JOptionPane;

public class questão3 {
    public static void main(String[] args) {
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite seu nome: ");
            String escolha = JOptionPane.showInputDialog("Escolha uma opção: a) Repita 1x; b) Repita 10x; c) Repita 100x; d) Sair.");


            if (escolha.equals("a")) {
                for (int x = 0; x < 1; x++) {
                    System.out.println(nome);
                }
            } else if (escolha.equals("b")) {
                for (int x = 0; x < 10; x++) {
                    System.out.println(nome);
                }
            } else if (escolha.equals("c")) {
                for (int x = 0; x < 100; x++) {
                    System.out.println(nome);
                }
            } else if (escolha.equals("d")){
                return;
            } else {
                System.out.println("[ERROR]");
            }
        }
    }
}