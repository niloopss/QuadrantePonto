import java.io.FileWriter;
import java.io.IOException;
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

        String resultado;
        if (quadrante == 0) {
            resultado = "O ponto está na origem.";
        } else {
            resultado = "O ponto está no quadrante " + quadrante;
        }

        System.out.println(resultado);

        try (FileWriter writer = new FileWriter("README.md", true)) {
            writer.write("\n## Resultado\n\n");
            writer.write(resultado + " (Coordenadas: " + x + ", " + y + ")\n");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo README.md: " + e.getMessage());
        }
    }
}
