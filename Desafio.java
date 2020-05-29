import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Menu iterativo com o usario
        // 1- Soma
        // 2 - Subtracao
        // 3 - Multiplica
        // 4 - Divisao
        // 5 - Resto
        // 6 - Tabuada
        // 0 - Saia do prgrama

        // O menu deve se repetir enquanto não for selecionada uma opção Correta
        // Caso o usuario digite zero, sairá do programa
        // Caso o usuario digite uma opção invalida, será exibido mensagem e programa se
        // repetirá
        // caso usuario digite uma opção valida, será exevutada a rotina respectiva a
        // opção do menu

        Scanner leitor = new Scanner(System.in);
        int opcaoSelecionada = 0;

        do {

            System.out.println("Menu ---");
            System.out.println("1 - Somar");
            System.out.println("0 - Sair");

            opcaoSelecionada = leitor.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                    int result = 1 + 2;
                    System.out.println(result);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("opção Invalida");
                    break;
            }
        } while (opcaoSelecionada != 0);// enquanto a opcaoSelecionada for diferente de zero , repita o laço
    }

}