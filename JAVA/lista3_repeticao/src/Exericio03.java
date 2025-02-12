import java.util.Scanner;

public class Exericio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int notaOtimo = 0, notaBom = 0, notaRuim = 0, totalRespostas = 0, somaNotas = 0;
        
        boolean responder = true;

        while(responder){

            System.out.println("Informe a sua nota para o filme, sendo: \n1-Ótimo \n2-Bom \n3-Ruim");
            int nota = scanner.nextInt();

            totalRespostas += 1;

            if (nota == 1){
                notaOtimo += 1;
                somaNotas += 1;
            }
            else if (nota == 2) {
                notaBom += 1;
                somaNotas += 2;
            }
            else if (nota == 3) {
                notaRuim += 1;
                somaNotas += 3;
            } else{
                System.out.println("Essa opção não é válida");
                totalRespostas -= 1;
                continue;
            }



            System.out.println("Quer adicionar mais uma nota? s/n: ");
            String resposta = scanner.next().toLowerCase();

            if (!resposta.equals("s")) {
            responder = false;
            }   
            
        }

        double media = somaNotas / totalRespostas;

        System.out.println("\nResumo da pesquisa:");
        System.out.println("Total de respostas: " + totalRespostas);
        System.out.printf("Responderam ótimo: " + notaOtimo + " pessoas, representando %.2f\n" , (notaOtimo * 100.0 / totalRespostas) , "%");
        System.out.printf("Responderam bom: " + notaBom + " pessoas, representando %.2f\n" , (notaBom * 100.0 / totalRespostas) , "%");
        System.out.printf("Responderam ruim: " + notaRuim + " pessoas, representando %.2f\n" , (notaRuim * 100.0 / totalRespostas) , "%");
        System.out.printf("A média de notas é: %.2f\n" , media);
       
        scanner.close();
    }
}
