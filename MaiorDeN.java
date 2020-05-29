import java.util.Scanner;

public class MaiorDeN {

    public static void main(String[] args) {
        
        // O usuario vai digitar quantos numeros ele quer comparar
        // O usuario vai digitar por N vezes (sendo o numero que ele escolheu)
        // Sistema comprar todos os numeros digitados, e encontrar o maior

        // iniciando a variavel de input

        System.out.println("\nSistema para leitura e comparacao");

        // definições de variaveis
        Scanner entradaDados = new Scanner(System.in);
        
        //captura das informações de quantidade
        System.out.print("\nInforme a quantidade de vezes que deseja comparar: ");
        int quantidadeVezes = entradaDados.nextInt();
        int valores[] = new int[quantidadeVezes]; // iniciando o array

        for (int contador=0; contador < quantidadeVezes; contador++) {
            System.out.print("\nInsira o valor da posicao " + contador + " : ");
            valores[contador] = entradaDados.nextInt();
        } // fim do for

        /*
        // teste para leitura
        for (int contador=0; contador < quantidadeVezes; contador++) {
            System.out.println(valores[contador]);
        } // fim do for
        */

        int analiseNumero = valores[0];
        for (int contador=0; contador < quantidadeVezes; contador++){
            if (valores[contador] > analiseNumero){
                analiseNumero = valores[contador];
            } // fim do if
        } // fim do for 

        System.out.println("\nO numero maior e: " + analiseNumero);

        entradaDados.close();
    } // fim do main
    
} // fim da class