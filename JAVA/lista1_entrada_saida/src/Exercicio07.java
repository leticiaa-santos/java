import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.next();

        System.out.print("Digite qual o mês: ");
        String mes = scanner.next();

        System.out.print("Digite a quantidade de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        float valorVenda = scanner.nextFloat();


        double salario = 1.500;
        double comissao_carro = carrosVendidos * 350;
        double comissao_venda = valorVenda * 0.001;


        double salario_total = salario + comissao_carro + comissao_venda;

        System.out.println("O funcionário " + nome + " no mês de" + mes + " recebeu: ");
        System.out.printf("R$ %.2f", salario_total);



    }
}
