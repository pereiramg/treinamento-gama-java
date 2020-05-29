import java.util.Scanner;

public class PrimeiroPrograma {
 
    public static void main(String args[]) {
         System.out.println("Olá Tech Insiders");
 
         int valorDaMinhaNotaNaProva = 10;
         System.out.println(valorDaMinhaNotaNaProva);
 
         float y = 1.2f;
         double z = 20.3;
         System.out.println(z);
 
         String nomeDoCurso = "Curso Java Tech Insiders 2020";
         System.out.println(nomeDoCurso);
 
         boolean ehVerdadeiro = true;
         System.out.println(ehVerdadeiro);
 
         double resultado = valorDaMinhaNotaNaProva * z;
         System.out.println(resultado);
 
         System.out.println("Valor da nota: " + valorDaMinhaNotaNaProva);
 

         Scanner leitor = new Scanner(System.in);
         System.out.println("Digite seu nome: ");
  
         String meuNome = leitor.nextLine();
  
         System.out.println("Olá, seja bem vindo: " + meuNome);
    }
}