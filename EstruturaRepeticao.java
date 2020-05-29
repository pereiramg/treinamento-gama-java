import java.util.Scanner;

public class EstruturaRepeticao {

    public static void main(String[] args) {
    // Tabuada a partir de um numero informado
    //exibir a tabuada que vá do 0 ao 10

    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o numero da tabuada: ");
    int tabuada = leitor.nextInt();

    for (int contador=0; contador <= 10; contador++){
        int resultadoTabuada = tabuada * contador;
        System.out.println(tabuada + " x " + contador + " = " + resultadoTabuada);
    } // fim for

    // int valores[] = new int[10];
    String nomes[] = new String[5];

    nomes[0] = "marcelo";
    nomes[1] = "luciana";
    nomes[2] = "luiz";
    nomes[3] = "marcela";
    nomes[4] = "jc";

    for (int contador=0; contador <= nomes.length; contador++){
        String nomeReservado = nomes[contador];
        nomeReservado = nomeReservado + " e programador java";
        System.out.println("Nome reservado --> " + nomeReservado);
    }
    
    leitor.close();
    }// fim main
} // fim da class