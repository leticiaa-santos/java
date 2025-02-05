import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float numero = scanner.nextFloat();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        System.out.println("Quadrado: "+quadrado);
        System.out.println("Cubo: "+cubo);
    }
}
