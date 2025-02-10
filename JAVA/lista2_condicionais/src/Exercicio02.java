import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor unitário do produto: ");
        float valorUnitario = scanner.nextFloat();

        System.out.println("Quantidade que deseja comprar: ");
        int quantidade = scanner.nextInt();

        if(quantidade <= 12){
            float valorTotal = quantidade * valorUnitario;
            System.out.printf("O valor total da compra é: R$ %.2f", valorTotal);
        }
        else {
            double desconto = valorUnitario - 0.1;
            double valorTotal = quantidade * (valorUnitario - desconto);
            System.out.printf("O valor total da compra é: R$ %.2f", valorTotal);

        }

    }
}
