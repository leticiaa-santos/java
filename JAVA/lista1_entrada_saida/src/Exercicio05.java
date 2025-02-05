import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        int hora = scanner.nextInt();

        System.out.print("Digite o minuto: ");
        int minuto = scanner.nextInt();

        System.out.print("Digite o segundo: ");
        int segundo = scanner.nextInt();

        int horaSegundo = ((hora * 3600) + (minuto * 60) + segundo);

        System.out.println("O horário em segundos é: " + horaSegundo + " segundos");
    }
}
