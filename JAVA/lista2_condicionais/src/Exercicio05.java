import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a quantidade atual em estoque: ");
        int quantidadeAtual = scanner.nextInt();

        System.out.println("Qual é a quantidade máxima do estoque: ");
        int quantidadeMaxima = scanner.nextInt();

        System.out.println("Qual é a quantidade mínima do estoque: ");
        int quantidadeMinima = scanner.nextInt();

        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima)/2;

        if(quantidadeAtual >= quantidadeMedia){
            System.out.println("Não efetuar compra");
        }
        else{
            System.out.println("Efetuar compra");
        }
    }
}
