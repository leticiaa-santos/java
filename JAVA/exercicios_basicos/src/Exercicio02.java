import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma temperatura em celcius: ");
        double temperatura_celcius = sc.nextDouble();

        double temperatura_fahrenheit = temperatura_celcius * 1.8 + 32;

        System.out.println("A temperatura "+ temperatura_celcius +"ºF em celcius é: "+ temperatura_fahrenheit+"ºC");
    }
}
