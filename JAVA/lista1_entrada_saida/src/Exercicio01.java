import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Digite sua data de nascimento: ");
        String dataNascimento = scanner.next();

        System.out.print("Digite sua pretenção salarial: ");
        float pretencaoSalarial = scanner.nextFloat();

        System.out.print("Digite seu grau de escolaridade (ensino médio, ensino técnico, ensino superior): ");
        String grauEscolar = scanner.next();

        System.out.print("Digite o cargo pretendido: ");
        String cargo = scanner.next();

        System.out.print("Possui CNH do tipo B? (sim/não): ");
        String cnh = scanner.next();

        System.out.println("Os dados informados foram: ");
        System.out.println("Nome: " + nome );
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Pretenção salaial: " + pretencaoSalarial);
        System.out.println("Grau de escolaridade: " + grauEscolar);
        System.out.println("Cargo pretendido: " + cargo);
        System.out.println("Possui CNH do tipo B? " + cnh);
        System.out.println("O seu cadastro foi confirmado!");
    }
}
