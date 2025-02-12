import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantIdade = 0, quantAltura = 0, quantPeso = 0;

        for(int i=1; i <= 10; i++){

            System.out.println("Pessoa " + i +":");

            System.out.println("Informe a idade: ");
            int idade = scanner.nextInt();

            System.out.println("Informe a altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Informe o peso: ");
            float peso = scanner.nextFloat();
            
            
            if (idade > 50){
                quantIdade += 1;
            }
            if (altura > 1.60) {
                quantAltura += 1;
            }
            if (peso < 80) {
                quantPeso += 1;
            }
        }

        System.out.println("Bem vindo ao menu \nO que deseja fazer: \n1- Verificar quantas pessoas tem idade acima de 50 anos \n2- Verificar quantas pessoas tem altura acima de 1.60  \n3- Verificar quantas pessoas tem abaixo de 80kg");


        int opcao_usuario = scanner.nextInt();

        switch (opcao_usuario){
            case 1:{
                System.out.println("A quantidade total de pessoas que tem idade acima de 50 anos é: "+ quantIdade);
                break;
            }
            case 2:{
                System.out.println("A quantidade total de pessoas que tem altura acima de 1.60 é: "+ quantAltura);
                break;
            }
            case 3:{
                System.out.println("A quantidade total de pessoas que tem abaixo de 80kg é: "+ quantPeso);
                break;
            }
            default:{
                System.out.println("Valor não identificado!");
                System.exit(0);
            }
        }

        scanner.close();

    }
    
}
