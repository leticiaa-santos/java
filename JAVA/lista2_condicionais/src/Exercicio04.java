import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o destino: \n1 - Maceió \n2 - Porto de galinhas: ");
        int destino = scanner.nextInt();

        System.out.println("Quer almoço/janta incluso? \n1 - Sim \n2 - Não: ");
        int refeicao = scanner.nextInt();

        float valorBase = 3000;

        if(destino == 1 && refeicao == 1){
            double valorTotal = valorBase + (valorBase * 1);
            System.out.println("O valor total da sua viagem é R$ " + valorTotal);
        } else if (destino == 1 && refeicao == 2) {
            double valorTotal = valorBase + (valorBase * 0.85);
            System.out.println("O valor total da sua viagem é R$ " + valorTotal);
        } else if (destino == 2 && refeicao == 1){
            double valorTotal = valorBase + (valorBase * 0.6);
            System.out.println("O valor total da sua viagem é R$ " + valorTotal);

        } else if (destino == 2 && refeicao == 2) {
            double valorTotal = valorBase + (valorBase * 0.45);
            System.out.println("O valor total da sua viagem é R$ " + valorTotal);

        }
        else{
            System.out.println("Essa opção não é válida!");
        }
    }
}
