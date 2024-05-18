import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o código da cor (1 - Vermelho, 2 - Amarelo, 3 - Verde): ");
            int corAtual = sc.nextInt();
            String proximaCor = calcularProximaCor(corAtual);

            if (proximaCor != null) {
                System.out.println("O próximo sinal é " + proximaCor);
            } else {
                System.out.println("Código de cor inválido");
            }
        } finally {
            sc.close();
        }
    }

    private static String calcularProximaCor(int corAtual) {
        if (corAtual == 1) {
            return "Verde";
        } else if (corAtual == 2) {
            return "Amarelo";
        } else if (corAtual == 3) {
            return "Vermelho";
        } else {
            return null;
        }
    }
}
