import java.util.Scanner;

public class EstruturaRepeticao2 {

    public static void main(String[] args) {

        int senha = 2020;
        int senhaDigitada = 0;

        Scanner entrada = new Scanner(System.in);
        boolean senhaIncorreta = true;

        while (senhaIncorreta) {
            System.out.print("DIGITE UMA SENHA: ");
            senhaDigitada = entrada.nextInt();

            if (senhaDigitada == senha) {
                System.out.println("Voce acertou a senha.. COFRE ABERTO!!!");
            } else {
                System.out.println("Voce errou a senha... tente novamente");
            } // fim else
        } // fim while
        entrada.close();
    } // fim main
}