import java.util.Scanner;

public class MaiorDeTres {

    // A partir de três numeros digitados
    // Indicar qual é o maior deles

    public static void main(String[] args) {
        
        // iniciando a variavel do tipo scanner
        Scanner entrada = new Scanner(System.in);

        System.out.println("Sistema Maior de Tres");

        //captura de dados
        System.out.print("\nInforme o primeiro numero: ");
        double numero1 = entrada.nextDouble();

        System.out.print("\nInforme o segundo numero: ");
        double numero2 = entrada.nextDouble();

        System.out.print("\nInforme o terceiro numero: ");
        double numero3 = entrada.nextDouble();

        // // realizando um sistema de IF para calculo
        // if (numero1 > numero2 && numero1 > numero3){
        //     System.out.println("\nO " + numero1 + " e maior que todos");
        // }
        // if (numero2 > numero1 && numero2 > numero3){
        //     System.out.println("\nO " + numero2 + " e maior que todos");
        // }
        // if (numero3 > numero1 && numero3 > numero2){
        //     System.out.println("\nO " + numero3 + " e maior que todos");
        // }
        
        // meio mais simples de resolver
        double maior = numero1;
        if (maior < numero2){
            maior = numero2;
        }
        if (maior < numero3){
            maior = numero3;
        }
        System.out.println("\nO" + maior + " e maior que todos");


        entrada.close();
    } // fim main
} // fim da class