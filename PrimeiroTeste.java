import java.util.Scanner;

public class PrimeiroTeste {

    public static void main (String args[]) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Realizando os testes com os operadores basicos");

        System.out.println("Digite o primeiro numero");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo numero");
        int numero2 = entrada.nextInt();

        // float somaResul = numero1 + numero2;
        // float subResul = numero1 - numero2;
        // float multResul = numero1 * numero2;
        // float divResul = numero1 / numero2;

        Matematica operacaoMatematicas = new Matematica();
        
        System.out.println("O resultado da soma dos numeros é: " + operacaoMatematicas.soma(numero1, numero2));
        System.out.println("O resultado da subtração dos numeros é: " + operacaoMatematicas.subtracao(numero1, numero2));
        System.out.println("O resultado da multiplicação dos numeros é: " + operacaoMatematicas.multiplicacao(numero1, numero2));
        System.out.println("O resultado da divisão dos numeros é: " + operacaoMatematicas.divisao(numero1, numero2)
        System.out.println("O resto da divisão dos numero é : " + operacaoMatematicas.restoDivisao(numero1, numero2)
    }
    
}