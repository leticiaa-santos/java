import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextFloat();

        double valorRepresentante = valorCompra * 0.20;
        double valorImposto = valorCompra * 0.30;
        double valorVenda = valorRepresentante + valorImposto + valorCompra;

        System.out.println("Valor do representante: " + valorRepresentante);
        System.out.println("Valor do imposto: " + valorImposto);
        System.out.println("Valor da venda: " + valorVenda);
    }
}
