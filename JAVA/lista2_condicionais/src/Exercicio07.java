import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual pergunta quer responder? 1 ou 2: ");

        int numeroPergunta = scanner.nextInt();

        if(numeroPergunta == 1){
            System.out.println("Qual é o símbolo químico da água?");
            System.out.println("a) CO₂");
            System.out.println("b) H₂O");
            System.out.println("c) O₂)");

            System.out.println("Qual a alternativa correta? ");
            String alternativa = scanner.next();

            if(alternativa.toLowerCase().equals("b")){
                System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners");
            }else{
                System.out.println("Você não acertou, mas tente novamente numa próxima");
            }
        }else if(numeroPergunta == 2){
            System.out.println("Qual é a capital do Brasil?");
            System.out.println("a) Rio de Janeiro");
            System.out.println("b) Brasília");
            System.out.println("c) São Paulo");

            System.out.println("Qual a alternativa correta? ");
            String alternativa = scanner.next();

            if(alternativa.toLowerCase().equals("b")){
                System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners");
            }else{
                System.out.println("Você não acertou, mas tente novamente numa próxima");
            }
        }else{
            System.out.println("Não temos esse número de pergunta!");
        }

        scanner.close();
    }
}