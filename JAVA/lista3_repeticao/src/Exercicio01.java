import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pares = 0, impares = 0, positivos = 0, negativos = 0;

        for(int i=0; i <= 10; i++){

            System.out.println("Informe um número inteiro, por gentileza: ");
            int numero = scanner.nextInt();
            if (numero < 0){
                negativos += 1;
            } else if (numero > 0) {
                positivos += 1;
            } else if (numero % 2 == 0) {
                pares += 1;
            }
            else {
                impares += 1;
            }
        }

        System.out.println("""
                
                Bem vindo ao menu
                O que deseja fazer:
                1- Verificar quantidade de Pares
                2- Verificar quantidade de Ímpares
                3- Verificar quantidade de Positivos
                4- Verificar quantidade de Negativos
                
                """);
        int opcao_usuario = scanner.nextInt();

        switch (opcao_usuario){
            case 1:{
                System.out.println("A quantidade total de números pares é: "+pares);
                break;
            }
            case 2:{
                System.out.println("A quantidade total de números ímpares é: "+impares);
                break;
            }
            case 3:{
                System.out.println("A quantidade total de números positivos é: "+positivos);
                break;
            }
            case 4:{
                System.out.println("A quantidade total de números negativos é: "+negativos);
                break;
            }
            default:{
                System.out.println("Valor não identificado!");
                System.exit(0);
            }
        }

    }
}
