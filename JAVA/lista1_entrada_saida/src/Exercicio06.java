import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();


        double mediaPonderada = (nota1 * 0.4) + (nota2 * 0.6) / (0.4 + 0.6);

        System.out.printf("Média: %.2f" , mediaPonderada);

    }
}
