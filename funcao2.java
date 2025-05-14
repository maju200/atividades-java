import java.time.LocalTime;

public class funcao2 {
    public static void saudacao() {
        LocalTime horas = LocalTime.now();
        int hora = horas.getHour();

        System.out.println("A hora atual é: " + hora);

        if (hora <= 11) {
            System.out.println("Bom dia");
        } else if (hora == 12 || hora < 18) {
            System.out.println("Bom tarde");
        } else {
            System.out.println("Boa noite");
        }
    }

    public static void main(String[] args) {
        saudacao();
    }
}