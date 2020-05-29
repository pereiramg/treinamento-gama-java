import java.util.Scanner;

/**
 * DesafioContaBancaria
 */
public class DesafioContaBancaria {

    public static void main(String[] args) {

        // criar uma aplicação chamada ibank
        // exibir menu com as opções
        // 1 - criar conta
        // 2 - sacar
        // 3 - depositar
        // 4 - transferir
        // 5 - exibir saldo
        // 6 - sair
        // qualquer opção diferente deve-se exibir mensagem de entrada invalida

        // Apresentação
        System.out.println("IBANK");
        System.out.println("Seja bem vindo ao nosso sistema bancario");

        // definição de minhas variaveis global
        Scanner entrada = new Scanner(System.in);
        int opcaoMenu;
        Double contas[] = new Double[5];
        int numeroConta;
        double valor;
        int numeroContatrans;

        // Criação dos Menus
        do {
            // Montando o menu para exibição
            System.out.println("=================== Menu ===================");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Realizar um Saque");
            System.out.println("3 - Realizar um deposito");
            System.out.println("4 - Realizar uma transferencia");
            System.out.println("5 - Exibir Saldo");
            System.out.println("6 - Sair do sistema Bancario");

            // capturar o valor selecionado
            opcaoMenu = entrada.nextInt();

            switch (opcaoMenu) {
                case 1:
                    // 1 - Criar conta
                    // preciso criar uma lista com limite de 5 contas por cliente
                    System.out.printf("\nEstamos validando o seu limite de criacao de conta ...\n");
                    if (contas[4] == null) {
                        for (int contador = 0; contador < contas.length; contador++) {
                            if (contas[contador] == null) {
                                contas[contador] = 0.0;
                                System.out.printf("\nConta de numero " + contador + " criado com sucesso\n");
                                break;
                            }
                        } // fim for
                    } else {
                        System.out.printf("\nInfelizmente voce chegou no limite de criacao de contas\n");
                        break;
                    }
                    break;
                case 2:
                    // Realizar um Saque
                    System.out.printf("\nInforme o numero da conta para realizar o saque\n");
                    numeroConta = entrada.nextInt();
                    if (numeroConta < 5) {
                        if (contas[numeroConta] == null) {
                            System.out.printf("\nConta nao existe, favor criar\n");
                            break;
                        } // fim

                        if (contas[numeroConta] <= 0.0) {
                            System.out.printf("\nInfelizmente voce não possui saldo em conta\n");
                            break;
                        } else {
                            System.out.printf("\nInforme o valor de saque\n");
                            valor = entrada.nextDouble();
                            if (valor <= contas[numeroConta]) {
                                contas[numeroConta] -= valor;
                                System.out.printf("\nSaque realizado com sucesso\n");
                                break;
                            } // fim
                        } // fim else
                    } else {
                        System.out.println("Conta nao existe");
                        break;
                    }
                case 3:
                    // Realizar um deposito
                    System.out.println("Informe o numero da conta para realizar o saque");
                    numeroConta = entrada.nextInt();
                    if (numeroConta < 5) {
                        if (contas[numeroConta] == null) {
                            System.out.println("Conta nao existe, favor criar");
                            break;
                        } // fim
                        System.out.println("Informe o valor de deposito");
                        valor = entrada.nextDouble();
                        contas[numeroConta] += valor;
                        System.out.println("Deposito realizado com sucesso");
                        break;
                    } // fim
                case 4:
                    // Realizar uma transferencia
                    System.out.println("Informe o numero da conta de origem para a transferencia");
                    numeroConta = entrada.nextInt();
                    if (numeroConta < 5) {
                        if (contas[numeroConta] == null) {
                            System.out.println("Conta nao existe, favor criar");
                            break;
                        } // fim

                        if (contas[numeroConta] <= 0.0) {
                            System.out.println("Infelizmente voce não possui saldo para essa operacao");
                            break;
                        } else {
                            System.out.println("Informe o valor da transferencia");
                            valor = entrada.nextDouble();

                            System.out.println("Informe o numero da conta de destino");
                            numeroContatrans = entrada.nextInt();
                            if (numeroContatrans < 5) {
                                if (contas[numeroContatrans] == null) {
                                    System.out.println("Conta de destino nao existe");
                                    break;
                                } // fim
                                contas[numeroConta] -= valor;
                                contas[numeroContatrans] += valor;
                                System.out.println("Transferencia realizada com sucesso");
                                break;
                            } else {
                                System.out.println("Conta nao existe");
                                break;
                            } // else
                        } // fim else
                    } else {
                        System.out.println("Conta nao existe");
                        break;
                    }
                case 5:
                    // exibir saldo
                    System.out.println("Informe o numero da conta para consulta o saldo");
                    numeroConta = entrada.nextInt();
                    if (numeroConta < 5) {
                        if (contas[numeroConta] == null) {
                            System.out.println("Conta nao existe, favor criar");
                            break;
                        } // fim
                        System.out.println("O saldo da conta  " + numeroConta + "  e: " + contas[numeroConta]);
                        break;
                    }
                case 6:
                    // 
                    System.out.println("Obrigado por utilizar o nosso sistema");
                    break;
                default:
                    System.out.println("Voce selecionou um valor errado");
                    break;
            } // fim switch

        } while (opcaoMenu != 6); // fim do while

    entrada.close();
    } // fim do main

} // fim da class
