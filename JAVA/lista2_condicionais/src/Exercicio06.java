import java.util.Random;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int chances = 3;
        
        while(chances > 0){
            System.out.println("Adivinhe o número sorteado de 1 a 100: ");
            int numeroAdivinha = scanner.nextInt();

            if(numeroAdivinha == numeroAleatorio){
                System.out.println("Você acertou!");
                break;
            }
            else{
                chances --;
                if(chances > 0){
                    System.out.println("Você errou! Tem mais " + chances + " chance(s)");
                }else{
                    System.out.println("Suas chances acabaram! O número sorteado era: " + numeroAleatorio);
                }
                
            }
        }

        scanner.close();
    }
}
