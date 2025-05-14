import javax.swing.JOptionPane;

public class funcao3 {
    public static void nome () {

            String nome = JOptionPane.showInputDialog("Digite seu nome: ");
            System.out.println(nome);
    }

    public static void main(String[] args) {
        nome();
    }
}
