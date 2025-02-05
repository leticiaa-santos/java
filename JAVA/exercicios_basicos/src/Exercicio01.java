import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma temperatura em fahrenheit: ");
        double temperatura_fahrenheit = sc.nextDouble();

        double temperatura_celcius = 5.9 * (temperatura_fahrenheit - 32);

        System.out.println("A temperatura "+ temperatura_fahrenheit +"ºF em celcius é: "+ temperatura_celcius+"ºC");
    }


}
