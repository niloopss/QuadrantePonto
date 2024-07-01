import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a coordenada x: ");
        int x = input.nextInt();

        System.out.print("Digite a coordenada y: ");
        int y = input.nextInt();

        Ponto ponto = new Ponto(x, y);
        int quadrante = ponto.getQuadrante();

        if (quadrante == 0) {
            System.out.println("O ponto está na origem.");
        } else {
            System.out.println("O ponto está no quadrante " + quadrante);
        }
    }
}
