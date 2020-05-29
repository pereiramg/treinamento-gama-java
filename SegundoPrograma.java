import java.util.Scanner;


public class SegundoPrograma {
    // Dado um salario
    // - calcular o imposto fixo: 15%
    // - informar o salario liquido


    public static void main(String args[]){

        Matematica operacaoMatematicas = new Matematica();

        Scanner salario = new Scanner(System.in);
        System.out.println("Realizando o calculo do seu salário liquido");

        System.out.println("Favor, informe seu salario Bruto:");
        double salarioBruto = salario.nextDouble();

        System.out.println("O valor do seu salário liquido é: " + operacaoMatematicas.porcentagem(salarioBruto));

    }
}