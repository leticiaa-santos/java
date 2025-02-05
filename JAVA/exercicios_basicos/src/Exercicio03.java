import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        float peso = scanner.nextFloat();

        System.out.println(" ");

        System.out.print("Digite sua altura: ");
        float altura = scanner.nextFloat();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f", imc);
    }
}
