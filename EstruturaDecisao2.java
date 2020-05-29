
public class EstruturaDecisao2 {

    public static void main(String[] args) {

        int numeroSelecionado = 5;

        if (numeroSelecionado == 1) {
            System.out.println("Ouviram dos ipiranga as margens placidas...");
        } else if (numeroSelecionado == 2) {
            System.out.println("Fique em casa, estamos em quarentena");
        } else if (numeroSelecionado == 3) {
            System.out.println("Cloroquina não cura covid...");
        } else if (numeroSelecionado == 4) {
            System.out.println("Estamos aprendendo Java");
        } else {
            System.out.println("você não selecionou uma opção valida");
        }

        switch (numeroSelecionado) {
            case 1:
                System.out.println("Ouviram dos ipiranga as margens placidas...");
                break;
            case 2:
                System.out.println("Fique em casa, estamos em quarentena");
                break;
            case 3:
                System.out.println("Cloroquina não cura covid...");
                break;
            case 4:
                System.out.println("Estamos aprendendo Java");
                break;
            case 5:
                System.out.println("você não selecionou uma opção valida");
                break;
            default:
                System.out.println("você não selecionou uma opção valida");
                break;
        } // fim Switch

    }
}