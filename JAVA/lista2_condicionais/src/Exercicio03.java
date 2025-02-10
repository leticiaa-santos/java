import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a quantidade de gols do time A: ");
        int goalsA = scanner.nextInt();

        System.out.println("Qual a quantidade de gols do time B: ");
        int goalsB = scanner.nextInt();

        if(goalsA > goalsB){
            System.out.println("O time vencedor é o A");
        }
        else if (goalsB > goalsA) {
            System.out.println("O time vencedor é o B");

        }
        else{
            System.out.println("Houve empate!");
        }
    }
}
