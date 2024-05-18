import java.util.Scanner;

public class ColorRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento de onda (em nm): ");
        double comprimentoDeOnda = sc.nextDouble();

        String cor = identificarCor(comprimentoDeOnda);

        if (cor != null) {
            System.out.println("A cor correspondente é: " + cor);
        } else {
            System.out.println("O comprimento de onda não está dentro do espectro visível.");
        }

        sc.close();
    }

    private static String identificarCor(double comprimentoDeOnda) {
        if (comprimentoDeOnda >= 380 && comprimentoDeOnda <= 450) {
            return "Violeta";

        } else if (comprimentoDeOnda > 450 && comprimentoDeOnda <= 495) {
            return "Azul";

        } else if (comprimentoDeOnda > 495 && comprimentoDeOnda <= 570) {
            return "Verde";

        } else if (comprimentoDeOnda > 570 && comprimentoDeOnda <= 590) {
            return "Amarelo";

        } else if (comprimentoDeOnda > 590 && comprimentoDeOnda <= 620) {
            return "Laranja";

        } else if (comprimentoDeOnda > 620 && comprimentoDeOnda <= 750) {
            return "Vermelho";

        } else {
            return null;
            
        }
    }
}
