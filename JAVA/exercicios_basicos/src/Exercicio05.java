import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        float base = scanner.nextFloat();

        System.out.println(" ");

        System.out.print("Digite o valor da altura: ");
        float altura = scanner.nextFloat();

        double area = (base * altura) / 2;

        System.out.printf("A área do triangulo é: %.2f", area);
    }
}
