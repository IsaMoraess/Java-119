import java.util.Scanner;

public class metodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a aceleração (m/s²): ");
        double aceleracao = sc.nextDouble();
        System.out.print("Digite a distância (m): ");
        double distancia = sc.nextDouble();

        CorridaDragster corrida = new CorridaDragster(aceleracao, distancia);

        double velocidadeFinal = corrida.calcularVelocidadeFinal();
        System.out.printf("A velocidade final é %.2f km/h.%n", velocidadeFinal);

        double recorde = 400.0;
        if (velocidadeFinal > recorde) {
            System.out.println("Novo recorde!");
        } else {
            System.out.println("Não bateu o recorde.");
        }
    }
}
