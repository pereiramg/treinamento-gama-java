import javax.naming.spi.DirStateFactory.Result;

public class Matematica {
    
    public double soma(double numero1, double numero2){
        return numero1 + numero2;
    }

    public double subtracao(double numero1, double numero2){
        return numero1 - numero2;
    }

    public double multiplicacao(double numero1, double numero2){
        return numero1 * numero2;
    }

    public double divisao(double numero1, double numero2){
        return numero1 / numero2;
    }

    public int restoDivisao(int numero1, int numero2){
        return numero1 % numero2;
    }

    public double porcentagem(double salario){
        return salario - (salario * 0.15);
    }
}